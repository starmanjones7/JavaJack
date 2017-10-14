package corm.kenny.jack.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/users")
@Controller
public class UserController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public Afoo getHello() {
		Afoo afoo = new Afoo();
		afoo.setName("Brandon");
		afoo.setSize(42);
		return afoo;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getUsers() {
		
	}
	
}
