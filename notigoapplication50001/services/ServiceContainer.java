package com.example.notigoapplication50001.services;

import com.example.notigoapplication50001.services.homework.HomeworkRepository;
import com.example.notigoapplication50001.services.homework.MockHomeworkRepository;
import com.example.notigoapplication50001.services.user.MockUserService;
import com.example.notigoapplication50001.services.user.UserService;

public class ServiceContainer {
    static HomeworkRepository hwrepo;
    public static UserService getUserService(){
        return new MockUserService();
    }
    public static HomeworkRepository getHomeworkRepository(){
        if(hwrepo == null){
            hwrepo = new MockHomeworkRepository();
        }
        return hwrepo;
    }
}
