package core;

import entities.concrete.User;
import google.googleSignUp;

public class GoogleManager implements GoogleService{

    @Override
    public void signUpWithGoogle(User user) {
        googleSignUp googleSignUp = new googleSignUp(user);
        System.out.println(user);
    }
}
