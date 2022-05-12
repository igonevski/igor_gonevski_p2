package dev.group1.Potlukk;

import dev.group1.Potlukk.entities.Potlukk;
import dev.group1.Potlukk.repos.PotlukkRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PotlukkRepoTests {

    @Autowired
    private final PotlukkRepo potlukkRepo;

    public PotlukkRepoTests(PotlukkRepo potlukkRepo) {
        this.potlukkRepo = potlukkRepo;
    }

    @Test
    @Order(1)
    public void createPotlukk() {
        Potlukk potlukk = new Potlukk(0, "Potluck!", 1652384393777L, 1, "somewhere");
        this.potlukkRepo.save(potlukk);
        System.out.println(potlukk);
        Assertions.assertNotEquals(0,potlukk.getId());
    }

    @Test
    @Order(2)
    public void getAllPotlukks() {
        List<Potlukk> potlukks = this.potlukkRepo.findAll();
        System.out.println(potlukks);
    }

    @Test
    @Order(3)
    public void getPotlukkById() {
        //Optional included here in the test to account for if the potlukk exists or not
        Optional<Potlukk> possiblePotlukk = this.potlukkRepo.findById(1);
        if(possiblePotlukk.isPresent()){
            Potlukk potlukk = possiblePotlukk.get();
            System.out.println(potlukk);
        }
        else{
            System.out.println("No Potlukk was returned.");
        }
        System.out.println(possiblePotlukk);
        // Non-optional without checking if potlukk exists
        // Potlukk potlukk = potlukkRepo.findById(1).get();
        // System.out.println(potlukk);
    }

    @Test
    @Order(4)
    public void getPotlukkByName() {
        List<Potlukk> potlukkswiththisname = this.potlukkRepo.findPotlukkByName("Potluck!");
        System.out.println(potlukkswiththisname);
    }

}
