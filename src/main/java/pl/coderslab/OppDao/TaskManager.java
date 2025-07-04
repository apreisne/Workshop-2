package pl.coderslab.OppDao;

import pl.coderslab.OppDao.dao.UserDao;

import java.sql.SQLException;
import java.util.Arrays;

public class TaskManager {

    public static void main(String[] args) throws SQLException {

        var userDao = UserDao.getInstance();
        Arrays.stream(userDao.findAll()).forEach(System.out::println);
    }
}
