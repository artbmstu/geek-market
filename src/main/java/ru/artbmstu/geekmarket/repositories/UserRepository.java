package ru.artbmstu.geekmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.artbmstu.geekmarket.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserName(String userName);
}