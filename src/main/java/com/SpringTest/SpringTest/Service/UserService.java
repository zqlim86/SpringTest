package com.SpringTest.SpringTest.Service;

import com.SpringTest.SpringTest.DataRepo.UserRepo;
import com.SpringTest.SpringTest.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getUserList(){
        return userRepo.findAll();
    }
}
