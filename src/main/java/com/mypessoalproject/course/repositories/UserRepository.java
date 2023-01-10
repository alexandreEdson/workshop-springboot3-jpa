package com.mypessoalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypessoalproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
