package dataAccess.concrete;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı sisteme eklendi: "
        +user.getName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden silindi: "
                +user.getName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı sistemde güncellendi: "
                +user.getName());
    }

    @Override
    public void login(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
