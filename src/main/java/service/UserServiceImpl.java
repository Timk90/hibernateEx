package service;

import dao.UserDAOImpl;
import models.Auto;
import models.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDAOImpl userDAO = new UserDAOImpl();

    public User findUserById(long id) {
        return userDAO.findUserById(id);
    }

    public void saveUser(User user) {
        userDAO.saveUsed(user);
    }

    public void updateUser(User user) {
        userDAO.ubdateUser(user);
    }

    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    public Auto findAutoById(long id) {
        return userDAO.findAutoById(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
