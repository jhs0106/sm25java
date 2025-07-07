package shop.service;

import shop.db.ItemDto;
import shop.repository.ItemMySqlRepository;
import shop.frame.SmService;
import shop.frame.SmRepository;
import java.util.List;

public class ItemService implements SmService<ItemDto, Integer> {
    SmRepository<ItemDto, Integer> smRepository;

    public ItemService() {
        smRepository = new ItemMySqlRepository();
    }

    @Override
    public void register(ItemDto itemDto) {
        System.out.println("ItemService: 상품 기본정보 저장");
        smRepository.insert(itemDto);
        System.out.println("ItemService: 상품 정보 등록 완료");
    }

    @Override
    public void modify(ItemDto itemDto) {
        System.out.println("ItemService: 상품 기본정보 수정");
        smRepository.update(itemDto);
        System.out.println("ItemService: 상품 정보 수정 완료");
    }

    @Override
    public void remove(Integer s) {
        System.out.println("ItemService: 상품 정보 삭제");
        smRepository.delete(s);
        System.out.println("ItemService: 상품 정보 삭제 완료");
    }

    @Override
    public List<ItemDto> get() {
        List<ItemDto> items = null;
        items = smRepository.selectAll();
        return items;
    }

    @Override
    public ItemDto get(Integer s) {
        ItemDto itemDto = null;
        itemDto = smRepository.select(s);
        return itemDto;
    }
}
