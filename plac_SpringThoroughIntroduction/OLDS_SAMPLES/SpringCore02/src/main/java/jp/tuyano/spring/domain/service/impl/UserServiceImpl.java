package jp.tuyano.spring.domain.service.impl;

//@Component
//public class UserServiceImpl  implements UserService {
//	private UserRepository userRepository;
//	private PasswordEncoder passwordEncoder;
//
////	public UserServiceImpl(javax.sql.DataSource dataSource) {
////		// データベース上のユーザー情報を操作する実装クラス
////		this.userRepository = new JdbcUserRepository(dataSource);
////		// BCryptアルゴリズムでハッシュ化する実装クラス
////		this.passwordEncoder = new BCryptPasswordEncoder();
////	}
//
//
//	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//		 this.userRepository = userRepository;
//		 this.passwordEncoder = passwordEncoder;
//	}
//
//	public void register(User user, String rawPassword) {
////		if (this.userRepository.countByUsername(user.getUsername()) > 0) {
////			// ユーザー名がすでに使用されていたら例外をスローする
////			throw new UserAlreadyRegisteredException();
////		}
////		// 生パスワードをハッシュ化して設定
////		user.setPassword(this.passwordEncoder.encode(rawPassword));
////		this.userRepository.save(user);
//	}
//
//	@Autowired
//	public void setUserRepository(final UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//
//	@Autowired
//	public void setPasswordEncoder(final PasswordEncoder passwordEncoder) {
//		this.passwordEncoder = passwordEncoder;
//	}
//	
//	
//}
