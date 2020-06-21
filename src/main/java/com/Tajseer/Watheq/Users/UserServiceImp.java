package com.Tajseer.Watheq.Users;

import com.Tajseer.Watheq.DTO.ObjectMapperUtils;
import com.Tajseer.Watheq.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {
    @Autowired
    public UserRep rep;
    @Override
    public User addUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return rep.save(user);
    }
    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = rep.findAll();
        List<UserDTO> userDTOS = ObjectMapperUtils.mapAll(users, UserDTO.class);
        return userDTOS;
    }
    @Override
    public User getUser(int userID) {
        return rep.findById(userID).get();
    }

    @Override
    public User updateUsers(User user, int userID) {
         user.setUserID(userID);
         return rep.save(user);
    }

    @Override
    public void delete(int userID) {
          rep.deleteById(userID);
    }
    @Override
    public String deleteAllUsers() {
        rep.deleteAll();
        return "All Users deleted";
    }

}
