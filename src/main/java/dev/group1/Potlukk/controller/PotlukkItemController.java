package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
public class PotlukkItemController {

    // Look at a potlukks items
    // Should be able to sort/get by status
    @GetMapping("/potlukks/{id}/items")
    public List<Item> getItemsByPotlukk(@PathVariable int id){
        return null;
    }

    // Add an item to a potlukk (nested)
    @PostMapping("/potlukks/{id}/items")
    public Item postItemToPotlukk(){
        return null;
    }
}
