package dev.group1.Potlukk;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.repos.ItemRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemRepoTests {

    @Autowired
    private final ItemRepo itemRepo;

    public ItemRepoTests(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    @Test
    @Order(1)
    public void createItem() {
        Item item = new Item(0, "Bread Pudding", "John Doe", "wanted", 1);
        this.itemRepo.save(item);
        System.out.println(item);
        Assertions.assertNotEquals(0,item.getId());
    }

    @Test
    @Order(2)
    public void getAllItems() {
        List<Item> items = this.itemRepo.findAll();
        System.out.println(items);
    }

    @Test
    @Order(3)
    public void getItemById() {
        //Optional included here in the test to account for if the item exists or not
        Optional<Item> possibleItem = this.itemRepo.findById(1);
        if(possibleItem.isPresent()){
            Item item = possibleItem.get();
            System.out.println(item);
        }
        else{
            System.out.println("No Item was returned.");
        }
        System.out.println(possibleItem);
        // Non-optional without checking if item exists
        // Item item = itemRepo.findById(1).get();
        // System.out.println(item);
    }

    @Test
    @Order(4)
    public void getItemByName() {
        List<Item> itemswiththisname = this.itemRepo.findItemByName("");
        System.out.println(itemswiththisname);
    }

    @Test
    @Order(5)
    public void getItemByPotlukk() {
        List<Item> itemswiththispotlukk = this.itemRepo.findItemByPotlukk("");
        System.out.println(itemswiththispotlukk);
    }

}
