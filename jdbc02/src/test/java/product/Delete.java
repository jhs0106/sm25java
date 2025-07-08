package product;

import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    public void delete(){
        System.out.println("Delete Test Start ...");
        ProductService productService = new ProductService();
        Integer i = 1004;
        try{
            productService.remove(i);
            System.out.println("삭제 성공");
        }catch(Exception e){
            System.out.println("삭제 실패, 오류 발생");
            e.printStackTrace();
        }
    }
}
