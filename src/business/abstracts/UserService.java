package business.abstracts;

import entities.concrete.User;

public interface UserService {
    public void signUp(User user);
    public void confirm(User user);
}
