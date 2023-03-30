package com.users.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.demo.entities.Users;

@Repository
public interface userRepository extends CrudRepository<Users, Long>   {

}
