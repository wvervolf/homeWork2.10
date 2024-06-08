package pro.sky.shop.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pro.sky.shop.model.Item;

import java.util.HashMap;
import java.util.Map;
@Component
public class ItemStore {
    private final Map<Integer, Item> itemsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        int idCounter = 1;
        itemsMap.put(idCounter, new Item(idCounter++, "Ноутбук"));
        itemsMap.put(idCounter, new Item(idCounter++, "Смарфон"));
        itemsMap.put(idCounter, new Item(idCounter++, "Принтер"));
    }
    public Item get(int id) {
        return itemsMap.get(id);
    }
}
