package ru.artbmstu.geekmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.artbmstu.geekmarket.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findOneByName(String theRoleName);
}