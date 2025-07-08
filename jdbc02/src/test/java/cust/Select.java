package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Select {

    @Test
    public void select() {
        try {
            CustService cs = new CustService();
            String custId = "id01";  // 존재하는 cust_id로 테스트할 것

            Cust cust = cs.get(custId);

            if (cust != null) {
                System.out.println(cust);
            } else {
                System.out.println("해당 고객이 존재하지 않습니다.");
            }

        } catch (Exception e) {
            System.err.println("조회 실패");
            e.printStackTrace();
        }
    }
}
