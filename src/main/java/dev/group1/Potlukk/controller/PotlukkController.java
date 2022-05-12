package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.entities.Potlukk;
import dev.group1.Potlukk.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class PotlukkController {

    // Add a new potlukk
    @PostMapping("/potlukks")
    public Potlukk postPotlukk(){
        return null;
    }

    // Look at all potlukks
    @GetMapping("/potlukks")
    public List<Potlukk> getPotlukks(){
        return null;
    }


    // Look at a specific potlukks info
    @GetMapping("potlukks/{id}")
    public Potlukk getPotlukkByID(@PathVariable int id){
        return null;
    }

    // Update Potlukk
    @PutMapping("/potlukks/{id}")
    public Potlukk putPotlukk(@PathVariable int id){
        return null;
    }

    // Delete a potlukk
    @DeleteMapping("potlukks/{id}")
    public void deletePotlukk(@PathVariable int id){

    }
}
