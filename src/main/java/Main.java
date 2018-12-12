import models.Auto;
import models.User;
import service.UserService;
import service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();
        User user = new User("Masha",26);
        userService.saveUser(user);
        //Auto ferrari = new Auto("Ferrari", "red");
        //ferrari.setUser(user);
        //user.addAuto(ferrari);
        //Auto ford = new Auto("Ford", "black");
        //ford.setUser(user);
        //user.addAuto(ford);
        //userService.updateUser(user);

        System.out.println(userService.findUserById(4));
        System.out.println(userService.findAll());


    }
}
