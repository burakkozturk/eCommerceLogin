package business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.GoogleManager;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserManager implements UserService {

    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserDao userDao, GoogleService googleService) {
        this.userDao = userDao;
        this.googleService = googleService;
    }

    @Override
    public void signUp(User user) {
        if(user.getName().length() < 1){
            System.out.println("Lütfen Geçerli İsim Giriniz!");
            return;
        }
        if(user.getPassword().length() < 6){
            System.out.println("Sifreniz 6 Karakterden Büyük Olmalıdır ");
            return;
        }

        final String emailPattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        final Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(user.getEmail());
        if (matcher.matches()) {
            System.out.println(user.getEmail() + " gecerli.");
        } else {
            System.out.println(user.getEmail() + " UYARI! Gecersiz bir email girdiniz.");
            return;
        }


        this.userDao.add(user);
        this.googleService.signUpWithGoogle(user);
    }

    @Override
    public void confirm(User user) {

    }
}
