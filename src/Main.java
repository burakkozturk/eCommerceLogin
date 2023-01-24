import business.abstracts.UserService;
import business.concrete.UserManager;
import core.GoogleManager;
import dataAccess.concrete.HibernateUserDao;
import entities.concrete.User;

public class Main {
    public static void main(String[] args) {

        User kullanici1 = new User(1,"Burak","burakozt"
        ,"burak123");

        UserService userService = new UserManager(new HibernateUserDao(),new GoogleManager());
        userService.signUp(kullanici1);
    }
}