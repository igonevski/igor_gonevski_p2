package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.utilities.Status;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class ItemController {

    // Add an item to a potlukk
    @PostMapping("/items")
    public Item postItem(){
        return null;
    }

    // Update Item
    @PutMapping("/items/{id}")
    public Item putItem(@PathVariable int id){
        return null;
    }

    // Change status
    @PatchMapping("/items/{id}/{status}")
    public Item patchStatus(@PathVariable int id, @PathVariable Status status){
        return null;
    }

    // Remove an item from the list
    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable int id){

    }
}
