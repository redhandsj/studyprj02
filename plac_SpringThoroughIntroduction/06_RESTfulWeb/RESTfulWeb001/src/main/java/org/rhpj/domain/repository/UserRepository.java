package org.rhpj.domain.repository;

import org.h2.engine.User;

public interface UserRepository {

	// ユーザー情報を永続化層に保存する
	User save(User user);

	// ユーザー数をカウントする
	int countByUsername(String username); 
}
