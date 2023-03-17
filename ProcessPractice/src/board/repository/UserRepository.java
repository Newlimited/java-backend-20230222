package board.repository;

import java.util.ArrayList;
import java.util.List;

import board.entity.User;

public class UserRepository {

	private static List<User> userTable = new ArrayList<>();
	public User findByEmail(String email) {
		User result = null;
		for (User user : userTable) {
			if(user.getEmail().equals(email)) {
				result = user;
				break;
			}
		}
		return result;
	}
	public boolean existsByEmail(String email) {
		boolean result = false;
		for(User user : userTable) {
			if(user.getEmail().equals(email)) {
				result = true;
				break; 
				// 실제 기능에서는 저장되어있는것과 비교할 수 없다 , 보안상이유는 암호화 시켜서 저장시켜놓기때문
			}
		}
		return result;
		
	}
	public User save(User user) {
		userTable.add(user);
		return user;
	}
}
