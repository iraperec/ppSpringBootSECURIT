package com.iraperec.ppSpringBoot.dao;


import com.iraperec.ppSpringBoot.model.User;


import java.util.List;
import java.util.Optional;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(long id);
    List<User> index();
    User show(long id);
    Optional<User> getUserByUsername(String username);
}
