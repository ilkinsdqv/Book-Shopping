package bookShopping.bookShoppingProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Xana doldurulmalıdır")
	@Size(min=2, message = "Minimum 2 simvol yazılmalıdır")
	@Size(max=30, message = "Maksimum 30 simvol yazmaq olar")
	@Column(columnDefinition = "VARCHAR(30)")
	private String name;
	
	@Column(columnDefinition = "VARCHAR(300)")
	@Size(max=300, message = "Maksimum 300 simvol yazmaq olar")
	private String description;
	
	@Min(value = 0, message = "Minimum qiymet 0 ola bilər")
	@Max(value = 1000, message = "Maksimum qiymet 1000 ola bilər")
	@NotNull(message = "Xana doldurulmalıdır")
	private Double price;
	
	@Column(columnDefinition = "VARCHAR(30)")
	@Size(max=30, message = "Maksimum 30 simvol yazmaq olar")
	private String author;
	
	@Min(value = 0, message = "Minimum səhifə sayı 0 ola bilər")
	@Max(value = 10000, message = "Maksimum səhifə sayı 10000 ola bilər")
	private Integer pageCount;
	private String image;
	private String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", author="
				+ author + ", pageCount=" + pageCount + ", image=" + image + ", username=" + username + "]";
	}
	
}
