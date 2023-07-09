package bookShopping.bookShoppingProject.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import bookShopping.bookShoppingProject.controller.CustomerController;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String note;
	
	@CreationTimestamp
	private Timestamp register;
	
	private Double totalPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="order_id")
	private List<BasketBook> basketBooks;
	private String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Timestamp getRegister() {
		return register;
	}
	public void setRegister(Timestamp register) {
		this.register = register;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<BasketBook> getBasketBooks() {
		if(basketBooks==null) {
			basketBooks = new ArrayList<BasketBook>();
		}
		return basketBooks;
	}
	public void setBasketBooks(List<BasketBook> basketBooks) {
		this.basketBooks = basketBooks;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", note=" + note + ", register=" + register + ", totalPrice=" + totalPrice
				+ ", customer=" + customer + ", basketBooks=" + basketBooks + ", username=" + username + "]";
	}
	
	
}
