package com.lorelei.service.user;

import com.lorelei.dao.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserAuthManagementDAO
{
    @Autowired
    private UserDAO userDAO;

    public boolean resetPassword(String email, String password)
    {
        return false;
    }

    // IE: Has it been more than 90 days since last
    // password reset? Might be rolled into something else.
    public boolean areCredentialsInvalid(String email, String password)
    {
        return false;
    }

    public boolean deactivate(String email, String password)
    {
        return false;
    }

    public boolean ban(String username, int durationInDays)
    {
        return false;
    }
}
