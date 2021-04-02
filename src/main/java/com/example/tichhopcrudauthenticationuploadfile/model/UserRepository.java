package com.example.tichhopcrudauthenticationuploadfile.model;

import com.example.tichhopcrudauthenticationuploadfile.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
