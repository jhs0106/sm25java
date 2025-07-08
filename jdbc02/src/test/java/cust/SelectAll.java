package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void selectAll(){
        CustService custService=new CustService();
        List<Cust> lists = null;
        try{
            lists = custService.get();
            lists.forEach(System.out::println);
        }catch(Exception e){
            System.err.println("조회 실패");
            e.printStackTrace();
        }
    }
}
