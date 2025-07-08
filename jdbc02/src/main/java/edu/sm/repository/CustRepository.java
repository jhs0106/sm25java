package edu.sm.repository;

import edu.sm.dto.Cust;
import edu.sm.frame.CustSql;
import edu.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements SmRepository<Cust, String> {

    @Override
    public void insert(Cust cust, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(CustSql.insert);
            psmt.setString(1, cust.getCustId());
            psmt.setString(2, cust.getCustPwd());
            psmt.setString(3, cust.getCustName());
            psmt.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            if(psmt != null){
                psmt.close();
            }
        }

    }

    @Override
    public void update(Cust cust, Connection conn) throws Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt = conn.prepareStatement(CustSql.update);
            pstmt.setString(1, cust.getCustPwd());
            pstmt.setString(2, cust.getCustName());
            pstmt.setString(3, cust.getCustId());
            pstmt.executeUpdate();

        }catch(Exception e){
            throw e;
        }finally {
            if(pstmt != null){
                pstmt.close();
            }
        }
    }

    @Override
    public void delete(String s, Connection conn) throws Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt = conn.prepareStatement(CustSql.delete);
            pstmt.setString(1, s);
            pstmt.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            if(pstmt != null){
                pstmt.close();
            }
        }

    }

    @Override
    public List<Cust> selectAll(Connection conn) throws Exception {
        List<Cust> list = new ArrayList<>();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(CustSql.selectAll);
            rs=psmt.executeQuery();
            while(rs.next()){
                Cust cust = new Cust();
                cust.setCustId(rs.getString("cust_id"));
                cust.setCustPwd(rs.getString("cust_pwd"));
                cust.setCustName(rs.getString("cust_name"));
                cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
                cust.setCustUpdate(rs.getTimestamp("cust_update"));
                list.add(cust);
            }
        }catch(Exception e){
            throw e;
        }finally {
            if(psmt != null){
                psmt.close();
            }
            if(rs != null){
                rs.close();
            }
        }

        return list;
    }

    @Override
    public Cust select(String s, Connection conn) throws Exception {
        Cust cust = new Cust();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(CustSql.select);
            psmt.setString(1, s);
            rs =psmt.executeQuery();
            if (rs.next()) {  // 데이터가 있을 때만 객체 생성
                cust = new Cust();
                cust.setCustId(rs.getString("cust_id"));
                cust.setCustPwd(rs.getString("cust_pwd"));
                cust.setCustName(rs.getString("cust_name"));
                cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
                cust.setCustUpdate(rs.getTimestamp("cust_update"));
            }

        } catch (Exception e) {
            throw e;
        }finally {
            if(psmt != null){
                psmt.close();
            }
            if(rs != null){
                rs.close();
            }
        }
        return cust;
    }
}
