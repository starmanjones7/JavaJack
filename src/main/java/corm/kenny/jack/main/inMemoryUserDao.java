package corm.kenny.jack.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class inMemoryUserDao implements UserDAO {
	
	 Map<String, User> m = new HashMap<String, User>();
	

	@Override
	public List<User> getUserList() {
		// Initialize frequency table from command line
		return new ArrayList<User>(m.values());
	}

	@Override
	public void saveUser(User user) {
		m.put(user.getId(), user);

	}

	@Override
	public User getUser(String id) {
		return m.get(id);
	}

}
