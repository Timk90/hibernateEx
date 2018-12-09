package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos;

    public User(){}

    public User(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void addAuto(Auto auto){
        auto.setUser(this);
        autos.add(auto);
    }



}
