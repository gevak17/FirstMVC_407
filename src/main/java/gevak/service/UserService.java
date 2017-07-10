package gevak.service;

import gevak.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void save(User user);

    void save(String name, String surName);

    void save(String name, String surName, int p1, int p2, int p3, int atestat);

    User findByOne(int id);

    List<User> findByAll();

}
