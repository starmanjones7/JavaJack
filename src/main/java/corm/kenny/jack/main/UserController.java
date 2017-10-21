package corm.kenny.jack.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/users")
@Controller
public class UserController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void createUser(@RequestBody User user) {
		userDao.saveUser(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getUsersList() {
		return userDao.getUserList();
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable("userId")String id) {
		return userDao.getUser(id);
	}
	
}
