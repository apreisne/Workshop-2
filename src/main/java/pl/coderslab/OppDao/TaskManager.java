package pl.coderslab.OppDao;

import pl.coderslab.OppDao.dao.UserDao;
import pl.coderslab.OppDao.entity.User;

import java.util.Arrays;

public class TaskManager {

    public static void main(String[] args) {

        var userDao = UserDao.getInstance();

        var userRead = userDao.read(10L);
        System.out.println(userRead.isPresent() ? userRead.get() : "null");


        var user22 = new User();
        user22.setUsername("username22");
        user22.setPassword("puszek1234");
        user22.setEmail("username22@gmail.com");

        Arrays.stream(userDao.findAll()).forEach(System.out::println);

        System.out.println(userDao.isPasswordCorrect(user22.getPassword()));

    }
}
