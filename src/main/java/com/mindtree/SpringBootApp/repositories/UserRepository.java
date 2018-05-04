package com.mindtree.SpringBootApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.SpringBootApp.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
