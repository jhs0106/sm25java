package product;

import edu.sm.dto.Cust;
import edu.sm.dto.Product;
import edu.sm.service.CustService;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Select {
    @Test
    public void select(){
        try{
            ProductService ps = new ProductService();
            Integer productId = 1001;  // 존재하는 product_id로 테스트할 것

            Product product = ps.get(productId);

            if (product != null) {
                System.out.println(product);
            } else {
                System.out.println("해당 상품이 존재하지 않습니다.");
            }

        }catch(Exception e){
            System.err.println("조회 실패");
            e.printStackTrace();
        }
    }
}
