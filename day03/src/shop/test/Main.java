package shop.test;

import shop.db.CustDto;
import shop.service.CustService;
import shop.frame.SmService;

import java.util.List;

//0707
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application");
        SmService<CustDto, String> smService;
        smService = new CustService();

        System.out.println("1. Cust Register ...");
        CustDto custDto = new CustDto("id01", "pwd01", "이말숙");
        smService.register(custDto);

        System.out.println("2. Cust getAll ...");
        List<CustDto> custs =null;
        custs = smService.get();
        for (CustDto cust : custs) {
            System.out.println(cust);
        }
        System.out.println("3. Cust Delete ...");
        String id = "id88";
        smService.remove(id);

        System.out.println("4. Cust select ...");
        String iid = "id01";
        CustDto myInfo = null;
        myInfo = smService.get(iid);
        System.out.println(myInfo);

        System.out.println("5. Cust update ...");
        CustDto uCust = new CustDto("id0","pwd01","홍말숙");
        smService.modify(uCust);
        System.out.println("End Main Application...");
    }
}
