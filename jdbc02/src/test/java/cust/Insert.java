package cust;

import edu.sm.service.CustService;
import edu.sm.dto.Cust;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void insert(){
        System.out.println("insert Test Start ...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id57")
                .custPwd("pwd57")
                .custName("주희종")
                .build();
        try{
            custService.register(cust);
            System.out.println("등록 정상");
        }catch (Exception e){
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}
