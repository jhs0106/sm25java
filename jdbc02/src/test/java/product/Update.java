package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    void updateProduct(){
        System.out.println("Update Start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder()
                .productName("비싼바지")
                .productPrice(500000)
                .discountRate(0.2)
                .productImg("bb.jpg")
                .cateId(10)
                .productId(1004)
                .build();
        try {
            productService.modify(product);
            System.out.println("물품 수정 성공");
        }catch (Exception e){
            System.out.println("수정 중 오류 발생");
            e.printStackTrace();
        }finally {

        }
    }
}
