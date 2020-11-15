package com.example.notigoapplication50001.services.user;

public interface UserService {
    /**
     * Attempts to log in a user. Returns null if user/pass is wrong.
     * @param username username/email of the user
     * @param password password of the user
     * @return User profile, NULL if wrong credentials
     */
    User login(String username, String password);
}
