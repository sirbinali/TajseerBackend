package com.Tajseer.Watheq.Users;

import com.Tajseer.Watheq.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Users")
public class UserController {
    @RequestMapping ("/We")
    public String alhasan(){
        return "SignUp";
    }

    @Autowired
    private UserService userService;



    @PostMapping(value = "/authenticate")
    public void authenticate(@RequestParam Map<String, String> body  ){

        System.out.println(" first name " + body.get("fname"));
        System.out.println(" Welcome to login page");
        System.out.println(" Welcome to login page");
        System.out.println(" Welcome to login page");



    }

    @PostMapping(value = "/adduser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);

    }

    @GetMapping(value = "/getAllUsers")
    public List<UserDTO> getAllUsers(){
      return userService.getAllUsers();
    }

    @GetMapping(value = "getuser")
    public User getUser(@PathVariable("/userID") int userID){
        return userService.getUser(userID);

    }

    @PutMapping(value = "/update User/{userID}")
    public User updateUsers(@RequestBody User user, @PathVariable("userID") int userID){
        return userService.updateUsers(user, userID);

    }

    @DeleteMapping(value = "/deleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID){
        userService.delete(userID);

    }

    @DeleteMapping(value = "deleteAll")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }

}
