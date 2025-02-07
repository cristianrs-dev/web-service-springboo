package com.academy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.academy.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
