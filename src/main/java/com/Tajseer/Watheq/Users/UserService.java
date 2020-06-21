package com.Tajseer.Watheq.Users;

import com.Tajseer.Watheq.DTO.UserDTO;

import java.util.List;


public interface UserService {
    public User addUser(User user);
    public List<UserDTO> getAllUsers();
    public User getUser (int userID);
    public User updateUsers (User user, int userID);
    public void delete(int userID);
    public String deleteAllUsers();

}