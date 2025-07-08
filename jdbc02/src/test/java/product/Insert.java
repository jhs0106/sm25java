package product;

import edu.sm.dto.Product;
import edu.sm.service.CustService;
import edu.sm.dto.Cust;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void insert(){
        System.out.println("insert Test Start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder()
                .productName("비싼운동화")
                .productPrice(1500000)
                .discountRate(0.1)
                .productImg("e1.jpg")
                .cateId(30)
                .build();
        try{
            productService.register(product);
            System.out.println("등록 정상");
        }catch (Exception e){
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}
