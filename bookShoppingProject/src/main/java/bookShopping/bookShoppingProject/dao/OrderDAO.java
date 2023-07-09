package bookShopping.bookShoppingProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bookShopping.bookShoppingProject.model.Book;
import bookShopping.bookShoppingProject.model.Order;

public interface OrderDAO extends JpaRepository<Order, Integer>{

	public List<Order> findAllByUsername(String username);
}
