package shop.repository;

import shop.frame.SmRepository;
import shop.db.CustDto;

import java.util.ArrayList;
import java.util.List;

// Cust 객체를 DB에 CRUD 하는 기능을 가진 Class
public class CustMySqlRepository implements SmRepository<CustDto, String> {

    @Override
    public void insert(CustDto custDto) {
        System.out.println("MySQL: Inserted Cust Table");
        System.out.println("MySQL: " + custDto);
    }

    @Override
    public void update(CustDto custDto) {
        System.out.println("MySQL: Updated Cust Table");
        System.out.println("MySQL: " + custDto);
    }

    @Override
    public void delete(String s) {
        System.out.println("MySQL: Deleted Cust Table");
        System.out.println("MySQL: " + s);
    }

    @Override
    public List<CustDto> selectAll() {
        System.out.println("MySQL: Select All Cust Table");
        List<CustDto> custDtos = new ArrayList<>();
        custDtos.add(new CustDto("id01","pwd01","이말숙"));
        custDtos.add(new CustDto("id02","pwd02","김말숙"));
        custDtos.add(new CustDto("id02","pwd02","홍말숙"));
        return custDtos;
    }

    @Override
    public CustDto select(String s) {
        System.out.println("MySQL: Select Cust Table");
        CustDto custDto = new CustDto(s, "pwd01", "이말자");
        return null;
    }
}
