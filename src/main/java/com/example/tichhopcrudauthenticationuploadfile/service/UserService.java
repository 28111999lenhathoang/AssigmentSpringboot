package com.example.tichhopcrudauthenticationuploadfile.service;


import com.example.tichhopcrudauthenticationuploadfile.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
