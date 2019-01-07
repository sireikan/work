package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	public List<User> findById(int id);
}
