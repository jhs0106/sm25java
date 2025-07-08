package lombock;

import edu.sm.dto.Cust;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

public class LombockTest {
    @Test
    public void test1(){
        System.out.println("Test ....");
        Cust cust = Cust.builder()
                .custId("id33")
                .custPwd("pwd33")
                .custName("홍말자")
                .build();
        System.out.println(cust);
    }
    @Test
    public void test2(){
        System.out.println("Test2 ....");
    }
}
