package ru.artbmstu.geekmarket.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.artbmstu.geekmarket.entities.SystemUser;
import ru.artbmstu.geekmarket.entities.User;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    void save(SystemUser systemUser);
}