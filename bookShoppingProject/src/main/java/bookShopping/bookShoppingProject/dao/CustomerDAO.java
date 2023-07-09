package bookShopping.bookShoppingProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bookShopping.bookShoppingProject.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	public Customer findByPhone(String phone);
	public Customer findByEmail(String email);
}
