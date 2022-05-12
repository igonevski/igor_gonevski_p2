package dev.group1.Potlukk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class User {
    @Id
    @Column(name = "user_id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "pw")
    private String password;
}
