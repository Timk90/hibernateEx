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

    public void removeAuto(Auto auto){
        autos.remove(auto);
    }

    public long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAutos(List<Auto> autos){
        this.autos = autos;
    }

    public List<Auto> getAutos(){
        return this.autos;
    }

    @Override
    public String toString(){
        return "User{id="+this.id+", name="+this.name+", age="+age+"}";
    }

}
