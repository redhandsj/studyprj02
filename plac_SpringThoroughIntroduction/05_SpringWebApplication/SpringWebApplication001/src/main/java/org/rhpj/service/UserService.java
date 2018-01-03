package org.rhpj.service;

import org.h2.engine.User;

public interface UserService {
	 // ユーザー情報を登録する処理
	 void register(User user, String rawPassword);
}
