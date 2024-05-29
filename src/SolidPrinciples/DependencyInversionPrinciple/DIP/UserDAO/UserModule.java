package SolidPrinciples.DependencyInversionPrinciple.DIP.UserDAO;

import SolidPrinciples.DependencyInversionPrinciple.DIP.Entity.User;

public class UserModule implements IUserModule{
    @Override
    public User getUser() {
        User user = new User();
        user.UserId = 1;
        user.name = "ransherraj";
        user.address = "UP, India";
        return user;
    }
}
