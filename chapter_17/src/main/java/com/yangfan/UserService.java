package com.yangfan;

import com.yangfan.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(User user) {
        System.out.println("Save user");
        System.out.println(user);
    }

    public User getUserById(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("test");
        return user;
    }
}
