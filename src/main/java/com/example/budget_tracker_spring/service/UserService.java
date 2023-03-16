package com.example.budget_tracker_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.budget_tracker_spring.entity.User;
import com.example.budget_tracker_spring.repository.UserRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepository userRepository;
	public List<User> searchAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
