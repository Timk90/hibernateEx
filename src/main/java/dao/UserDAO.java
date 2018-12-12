package dao;

import models.Auto;
import models.User;

import java.util.List;

public interface UserDAO {

    public User findUserById(long id);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public Auto findAutoById(long id);
    public List<User> findAll();


}
