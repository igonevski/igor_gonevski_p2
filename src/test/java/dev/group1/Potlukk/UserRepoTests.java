package dev.group1.Potlukk;

import dev.group1.Potlukk.entities.User;
import dev.group1.Potlukk.repos.UserRepo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class UserRepoTests  {

    @Autowired
    private final UserRepo userRepo;

    public UserRepoTests(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Test
    @Order(1)
    public void createUser() {
        User user = new User(0, "John Doe", "password*@#$%^");
        this.userRepo.save(user);
        System.out.println(user);
        Assertions.assertNotEquals(0,user.getId());
    }

    @Test
    @Order(2)
    public void getAllUsers() {
        List<User> users = this.userRepo.findAll();
        System.out.println(users);
    }

    @Test
    @Order(3)
    public void getUserById() {
        //Optional included here in the test to account for if the user exists or not
        Optional<User> possibleUser = this.userRepo.findById(1);
        if(possibleUser.isPresent()){
            User user = possibleUser.get();
            System.out.println(user);
        }
        else{
            System.out.println("No User was returned.");
        }
        System.out.println(possibleUser);
        // Non-optional without checking if user exists
        // User user = userRepo.findById(1).get();
        // System.out.println(user);
    }

    @Test
    @Order(4)
    public void getUserByName() {
        List<User> userswiththisname = this.userRepo.findUserByName("John Doe");
        System.out.println(userswiththisname);
    }

}
