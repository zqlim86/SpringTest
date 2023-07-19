package com.SpringTest.SpringTest.Controller;

import com.SpringTest.SpringTest.Model.User;
import com.SpringTest.SpringTest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUserList();
    }

}
