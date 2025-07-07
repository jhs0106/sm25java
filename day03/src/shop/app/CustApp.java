package shop.app;

import shop.db.CustDto;
import shop.service.CustService;

import java.util.List;
import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustService custService = new CustService();

        while(true){
            System.out.println("Enter Command: ");
            System.out.println("(i : Register, sa : Select all, s : Select, d : Delete, u : Update, q : Exit)");
            String cmd = sc.nextLine();

            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;

            }else if(cmd.equals("i")){
                System.out.println("Register Start ...");
                System.out.println("Enter the ID: ");
                String rID = sc.nextLine();
                System.out.println("Enter the Password: ");
                String rPassword = sc.nextLine();
                System.out.println("Enter the Name: ");
                String rName = sc.nextLine();
                CustDto custDto = new CustDto(rID,rPassword,rName);
                custService.register(custDto);

            }else if(cmd.equals("sa")){
                System.out.println("Search All...");
                List<CustDto> custDtos = null;
                custDtos = custService.get();
                for (CustDto cust : custDtos) {
                    System.out.println(cust);
                }

            }else if(cmd.equals("s")) {
                System.out.println("Search...");
                System.out.println("Enter the ID: ");
                String sID = sc.nextLine();
                CustDto myInfo = null;
                myInfo = custService.get(sID);
                System.out.println(myInfo);

            }else if(cmd.equals("d")){
                System.out.println("Delete...");
                System.out.println("Enter the ID: ");
                String dID = sc.nextLine();
                custService.remove(dID);

            }else if(cmd.equals("u")){
                System.out.println("Update...");
                System.out.println("Enter the new ID: ");
                String newID = sc.nextLine();
                System.out.println("Enter new Password: ");
                String newPassword = sc.nextLine();
                System.out.println("Enter new Name: ");
                String newName = sc.nextLine();
                CustDto newCust = new CustDto(newID,newPassword,newName);
                custService.modify(newCust);


            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
