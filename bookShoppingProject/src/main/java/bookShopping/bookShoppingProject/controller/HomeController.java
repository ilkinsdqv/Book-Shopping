package bookShopping.bookShoppingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bookShopping.bookShoppingProject.config.MySession;

@Controller
public class HomeController {
	@Autowired
	private MySession mySession;
	
	@GetMapping(path = {"/home","/"})
	public String showHomePage(Model model) {
		String username= mySession.getUsername();
		if(username.equals("anonymousUser")) {
			
		}else {
			model.addAttribute("username", username);
		}
		
		return "home";
	}
}
