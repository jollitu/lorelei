package com.lorelei.service.user;

import com.lorelei.repo.user.UserRepository;
import com.lorelei.model.user.User;
import com.lorelei.model.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO userDTO)
    {
        // TODO:
        // 1. Check if username already exists
        User existing = userRepository.getByUsername(userDTO.getUsername());

        if (existing != null)
        {
            // TODO
        }

        // 2. Check if email is already in use
        existing = userRepository.getByEmail(userDTO.getEmail());

        if (existing != null)
        {
            // TODO
        }
        // 3. Check if account is active and direct to a reactivate page if not

        User user = new User();

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        User newUser = userRepository.save(user);

        return newUser;
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
