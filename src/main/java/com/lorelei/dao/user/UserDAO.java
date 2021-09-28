package com.lorelei.dao.user;

import com.lorelei.model.user.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserDAO
{
    public User getUserByEmail(String email)
    {
        return new User();
    }

    public User getUserByUsername(String username)
    {
        return new User();
    }
}
