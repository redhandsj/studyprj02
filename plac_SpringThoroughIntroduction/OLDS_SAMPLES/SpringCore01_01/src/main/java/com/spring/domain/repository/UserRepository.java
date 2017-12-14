package com.spring.domain.repository;

import org.springframework.security.core.userdetails.User;

public interface UserRepository {
	// ユーザー情報を永続化層に保存する
	 User save(User user);
	 // ユーザー数をカウントする
	 int countByUsername(String username);
}
