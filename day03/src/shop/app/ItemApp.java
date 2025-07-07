package shop.app;

import shop.db.ItemDto;
import shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ItemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemService itemService = new ItemService();

        while(true){
            System.out.println("Enter Command: ");
            System.out.println("(i : Register, sa : Select all, s : Select, d : Delete, u : Update, q : Exit)");
            String cmd = sc.nextLine();

            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;

            }else if(cmd.equals("i")){
                System.out.println("Register Start ...");
                System.out.println("Enter the Item Id(1~100000) :");
                String rID = sc.nextLine();
                System.out.println("Enter the Item Name :");
                String itemName = sc.nextLine();
                System.out.println("Enter the Item Price :");
                String price = sc.nextLine();
                ItemDto itemDto = new ItemDto(Integer.parseInt(rID), itemName, Integer.parseInt(price));
                itemService.register(itemDto);

            }else if(cmd.equals("sa")){
                System.out.println("Search...");
                List<ItemDto> itemDtos = null;
                itemDtos = itemService.get();
                for(ItemDto itemDto : itemDtos){
                    System.out.println(itemDto);
                }

            }else if(cmd.equals("s")){
                System.out.println("Search...");
                System.out.println("Enter the Item Id : ");
                String sID = sc.nextLine();
                ItemDto iteminfo = null;
                iteminfo = itemService.get(Integer.parseInt(sID));
                System.out.println(iteminfo);

            }else if(cmd.equals("d")){
                System.out.println("Delete...");
                System.out.println("Enter the Item Id : ");
                String dID = sc.nextLine();
                itemService.remove(Integer.parseInt(dID));

            }else if(cmd.equals("u")){
                System.out.println("Update...");
                System.out.println("Enter the new Item Id : ");
                String newID = sc.nextLine();
                System.out.println("Enter the new Item Name :");
                String newName = sc.nextLine();
                System.out.println("Enter the new Price :");
                String newPrice = sc.nextLine();
                ItemDto newItem = new ItemDto(Integer.parseInt(newID), newName, Integer.parseInt(newPrice));
                itemService.modify(newItem);

            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
