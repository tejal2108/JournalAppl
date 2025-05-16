package com.TDProject.JournalApplication.Controller;

import com.TDProject.JournalApplication.Entity.User;
import com.TDProject.JournalApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private UserService userService;

    @GetMapping("health-check")
    public String HealthCheck(){
        return "Ok";
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userService.saveNewEntry(user);
    }

}
