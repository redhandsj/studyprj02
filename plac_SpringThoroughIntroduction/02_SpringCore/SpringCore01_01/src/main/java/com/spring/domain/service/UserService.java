package com.spring.domain.service;

import org.springframework.security.core.userdetails.User;

public interface UserService {
	// ユーザー情報を登録する処理
	 void register(User user, String rawPassword);
}
