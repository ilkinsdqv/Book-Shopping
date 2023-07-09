package bookShopping.bookShoppingProject.config;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import bookShopping.bookShoppingProject.model.BasketBook;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MySession {
	private String username;
	private List<BasketBook> basketBooks;
	
	public MySession() {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String username = loggedInUser.getName();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<BasketBook> getBasketBooks() {
		return basketBooks;
	}

	public void setBasketBooks(List<BasketBook> basketBooks) {
		this.basketBooks = basketBooks;
	}
}
