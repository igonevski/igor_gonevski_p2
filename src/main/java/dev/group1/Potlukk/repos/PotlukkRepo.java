package dev.group1.Potlukk.repos;

import dev.group1.Potlukk.entities.Potlukk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface PotlukkRepo extends JpaRepository<Potlukk, Integer> {
    List<Potlukk> findPotlukkByName(String name);
}
