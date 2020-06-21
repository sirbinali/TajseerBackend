package com.Tajseer.Watheq.Users;

import com.Tajseer.Watheq.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRep extends JpaRepository<User, Integer>{

}
