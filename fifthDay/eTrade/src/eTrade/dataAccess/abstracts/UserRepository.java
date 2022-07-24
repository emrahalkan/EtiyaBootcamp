package eTrade.dataAccess.abstracts;

import eTrade.entities.concretes.User;

import java.util.List;

public interface UserRepository {
    void add(User user);
    void update(User user);
    void delete(User user);
    User getById(int id);
    List<User> getAll();
}
