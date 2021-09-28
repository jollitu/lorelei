package com.lorelei.service.user;

import com.lorelei.model.user.User;
import com.lorelei.model.user.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    public User register(UserDTO userDTO)
    {
        // TODO:
        // 1. Check if username already exists
        // 2. Check if email is already in use
        // 3. Check if account is active and direct to a reactivate page if not
        User user = new User();

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        // TODO: DB hookup for save

        return new User();
    }

    public User login(UserDTO userDTO)
    {
        // TODO DB hookup for lookup
        User user = new User();

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        return new User();
    }
}