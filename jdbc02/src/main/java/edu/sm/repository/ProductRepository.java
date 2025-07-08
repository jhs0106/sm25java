package edu.sm.repository;

import edu.sm.dto.Product;
import edu.sm.frame.ProductSql;
import edu.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {
    @Override
    public void insert(Product product, Connection conn) throws Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt =  conn.prepareStatement(ProductSql.insert);
            pstmt.setString(1, product.getProductName());
            pstmt.setInt(2, product.getProductPrice());
            pstmt.setDouble(3, product.getDiscountRate());
            pstmt.setString(4, product.getProductImg());
            pstmt.setInt(5, product.getCateId());
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
    public void update(Product product, Connection conn) throws Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt =  conn.prepareStatement(ProductSql.update);
            pstmt.setString(1, product.getProductName());
            pstmt.setInt(2, product.getProductPrice());
            pstmt.setDouble(3, product.getDiscountRate());
            pstmt.setString(4, product.getProductImg());
            pstmt.setInt(5, product.getCateId());
            pstmt.setInt(6, product.getProductId());
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
    public void delete(Integer integer, Connection conn) throws Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt =  conn.prepareStatement(ProductSql.delete);
            pstmt.setInt(1, integer);
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
    public List<Product> selectAll(Connection conn) throws Exception {
        List<Product> products = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            pstmt = conn.prepareStatement(ProductSql.selectAll);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductPrice(rs.getInt("product_price"));
                product.setDiscountRate(rs.getDouble("discount_rate"));
                product.setProductImg(rs.getString("product_img"));
                product.setProductRegdate(rs.getTimestamp("product_regdate"));
                product.setProductUpdate(rs.getTimestamp("product_update"));
                product.setCateId(rs.getInt("cate_id"));
                products.add(product);
            }
        }catch(Exception e){
            throw e;
        }finally {
            if(pstmt != null){
                pstmt.close();
            }
            if(rs != null){
                rs.close();
            }
        }

        return products;
    }

    @Override
    public Product select(Integer integer, Connection conn) throws Exception {
        Product product = new Product();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            pstmt = conn.prepareStatement(ProductSql.select);
            pstmt.setInt(1, integer);
            rs = pstmt.executeQuery();
            if(rs.next()){
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductPrice(rs.getInt("product_price"));
                product.setDiscountRate(rs.getDouble("discount_rate"));
                product.setProductImg(rs.getString("product_img"));
                product.setProductRegdate(rs.getTimestamp("product_regdate"));
                product.setProductUpdate(rs.getTimestamp("product_update"));
                product.setCateId(rs.getInt("cate_id"));
            }

        }catch(Exception e){
            throw e;
        }finally {
            if(pstmt != null){
                pstmt.close();
            }
            if(rs != null){
                rs.close();
            }
        }
        return product;
    }
}