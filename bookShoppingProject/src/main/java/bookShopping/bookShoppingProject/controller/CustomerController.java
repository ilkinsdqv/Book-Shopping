package bookShopping.bookShoppingProject.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bookShopping.bookShoppingProject.config.MySession;
import bookShopping.bookShoppingProject.dao.BookDAO;
import bookShopping.bookShoppingProject.model.Book;

@Controller
public class CustomerController {
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private MySession mySession;
	
	@GetMapping(path = "/customer")
	public String showCustomerPage(Model model) {
		List<Book> books= bookDAO.findAll();
		model.addAttribute("books", books);
		return "customer";
	}
	
}
