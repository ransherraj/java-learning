package SolidPrinciples.DependencyInversionPrinciple.DIP.UserDAO;

import SolidPrinciples.DependencyInversionPrinciple.DIP.Entity.User;

public interface IUserModule {
    public User getUser();
}
