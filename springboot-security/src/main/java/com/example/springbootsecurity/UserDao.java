package com.example.springbootsecurity;


import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
