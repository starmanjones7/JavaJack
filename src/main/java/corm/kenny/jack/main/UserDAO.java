package corm.kenny.jack.main;

import java.util.List;

public interface UserDAO {
	public List<User> getUserList();
	public void saveUser(User user);
	public User getUser(String id);
}
