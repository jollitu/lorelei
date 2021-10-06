package com.lorelei.repo.user;

import com.lorelei.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    User getByEmail(String email);
    User getByUsername(String username);
}
