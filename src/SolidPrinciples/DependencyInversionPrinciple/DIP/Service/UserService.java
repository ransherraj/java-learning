package SolidPrinciples.DependencyInversionPrinciple.DIP.Service;

import SolidPrinciples.DependencyInversionPrinciple.DIP.UserDAO.IUserModule;

public class UserService {
    public IUserModule iUserModule;
    void getUser(){
        iUserModule.getUser();
    }
}
