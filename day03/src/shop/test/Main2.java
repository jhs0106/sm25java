package shop.test;

import shop.db.ItemDto;
import shop.service.ItemService;
import shop.frame.SmService;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start Main Application");
        SmService<ItemDto, Integer> smService;
        smService = new ItemService();

        System.out.println(("1. Item Register ..."));
        ItemDto itemDto = new ItemDto(5, "Galaxy S25 ULTRA", 2000000.0);
        smService.register(itemDto);

        System.out.println("2. Item getAll ...");
        List<ItemDto> itemDtos = null;
        itemDtos = smService.get();
        for (ItemDto itemDto1 : itemDtos) {
            System.out.println(itemDto1);
        }
        System.out.println("3. Item Delete ...");
        Integer id = 6;
        smService.remove(id);

        System.out.println("4. Item select ...");
        Integer id2 = 7;
        ItemDto itemDto2 = smService.get(id2);
        System.out.println(itemDto2);

        System.out.println("5. Item update ...");
        ItemDto uItem = new ItemDto(0, "Galaxy S25+", 1500000.0);
        smService.modify(uItem);

        System.out.println("End Main Application...");
    }
}
