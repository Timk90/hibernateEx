package models;

import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {
    long id;
    String color;
    User user;

    public void setUser(User user){
        this.user = user;
    }

}
