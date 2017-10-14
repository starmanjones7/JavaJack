package corm.kenny.jack.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/demo")
@Controller
public class UserController {
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public Afoo getHello() {
		Afoo afoo = new Afoo();
		afoo.setName("Brandon");
		afoo.setSize(42);
		return afoo;
	}
}
