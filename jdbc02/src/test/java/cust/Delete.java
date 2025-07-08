package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    public void delete(){
        CustService custService = new CustService();
        String s = "id57";
        try{
            custService.remove(s);
            System.out.println("삭제 성공");
        }catch(Exception e){
            System.out.println("삭제 실패, 오류 발생");
            e.printStackTrace();
        }
    }
}
