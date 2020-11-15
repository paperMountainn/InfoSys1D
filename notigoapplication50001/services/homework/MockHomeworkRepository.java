package com.example.notigoapplication50001.services.homework;

import com.example.notigoapplication50001.services.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MockHomeworkRepository implements HomeworkRepository{

    private final HashMap<User, List<Homework>> database;

    public MockHomeworkRepository(){
        database = new HashMap<>();
    }

    @Override
    public List<Homework> getHomeworkForUser(User user) {
        List<Homework> homeworks = database.get(user);
        if(homeworks == null){
            return new ArrayList<Homework>();
        }
        return new ArrayList<Homework>(homeworks);
    }

    @Override
    public void addHomeworkForUser(User user, Homework homework) {
        List<Homework> homeworks = database.get(user);
        if(homeworks == null){
            homeworks = new ArrayList<Homework>();
            database.put(user, homeworks);
        }
        homeworks.add(homework);
    }
}
