package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    public void update(){
        System.out.println("Update test Start ....");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id01")
                .custPwd("pwd01")
                .custName("주민성")
                .build();
        try{
            custService.modify(cust);
            System.out.println("등록 정상");
        }catch (Exception e){
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}
