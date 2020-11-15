package com.example.notigoapplication50001.services.homework;

import com.example.notigoapplication50001.services.user.User;

import java.util.List;

/**
 * This service is responsible for keeping track who has what homework
 */
public interface HomeworkRepository {
    /**
     * Gets the homeworks of this user
     * @param user
     * @return homeworks
     */
    List<Homework> getHomeworkForUser(User user);

    /**
     * Assign this homework to this user
     * @param user
     * @param homework
     */
    void addHomeworkForUser(User user, Homework homework);
}
