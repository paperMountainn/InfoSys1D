package com.example.notigoapplication50001.services.user;

/**
 * This is a mock user service
 * It will accept "norman@sutd.edu.sg", "infosys" as use and password
 */
public class MockUserService implements UserService {
    @Override
    public User login(String username, String password) {
        if(username.equals("norman@sutd.edu.sg") && password.equals("infosys")){
            return new User("norman", "norman@sutd.edu.sg");
        }
        return null;
    }
}
