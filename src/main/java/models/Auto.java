package models;

import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Auto(){}

    public Auto(String model, String color){
        this.color = color;
        this.model = model;
    }

    public long getId(){
        return this.id;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }


    public void setUser(User user){
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    @Override
    public String toString(){
        return color+" "+model;
    }




}
