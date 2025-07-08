package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    void selectAll(){
        ProductService productService = new ProductService();
        List<Product> lists = null;
        try{
            System.out.println("조회 성공");
            lists = productService.get();
            lists.forEach(System.out::println);
        }catch(Exception e){
            System.out.println("조회 실패");
            e.printStackTrace();
        }
    }
}
