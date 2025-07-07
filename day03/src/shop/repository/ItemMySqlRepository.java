package shop.repository;

import shop.frame.SmRepository;
import shop.db.ItemDto;

import java.util.ArrayList;
import java.util.List;

public class ItemMySqlRepository implements SmRepository<ItemDto, Integer> {


    @Override
    public void insert(ItemDto itemDto) {
        System.out.println("MySQL: Insert Item");
        System.out.println("MySQL: "+itemDto);
    }

    @Override
    public void update(ItemDto itemDto) {
        System.out.println("MySQL: Update Item");
        System.out.println("MySQL: "+itemDto);
    }

    @Override
    public void delete(Integer s) {
        System.out.println("MySQL: Delete Item");
        System.out.println("MySQL: "+s);
    }

    @Override
    public List<ItemDto> selectAll() {
        System.out.println("MySQL: Select All Item");
        List<ItemDto> itemDtos = new ArrayList<>();
        itemDtos.add(new ItemDto(1,"RTX5090", 3000000.0));
        itemDtos.add(new ItemDto(2,"Ryzen9800x3D", 650000.0));
        itemDtos.add(new ItemDto(3,"Galaxy S25 slim", 1650000.0));
        return itemDtos;
    }

    @Override
    public ItemDto select(Integer s) {
        System.out.println("MySQL: Select Item");
        ItemDto itemDto = new ItemDto(s, "RTX5080", 1890000.0);
        return null;
    }
}
