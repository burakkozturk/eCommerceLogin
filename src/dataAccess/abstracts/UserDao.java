package dataAccess.abstracts;

import entities.concrete.User;

import java.util.List;

public interface UserDao {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public void login(User user);

    List<User> getAll();
}
