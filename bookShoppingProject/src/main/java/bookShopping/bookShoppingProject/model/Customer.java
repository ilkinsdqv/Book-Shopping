package bookShopping.bookShoppingProject.model;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Xana doldurulmalıdır")
	@Size(min=2, message = "Minimum 2 simvol yazılmalıdır")
	@Size(max=30, message = "Maksimum 30 simvol yazmaq olar")
	@Column(columnDefinition = "VARCHAR(30)")
	private String name;
	
	@NotEmpty(message = "Xana doldurulmalıdır")
	@Size(min=2, message = "Minimum 2 simvol yazılmalıdır")
	@Size(max=200, message = "Maksimum 200 simvol yazmaq olar")
	@Column(columnDefinition = "VARCHAR(200)")
	private String address;
	
	@NotEmpty(message = "Xana doldurulmalıdır")
	@Column(columnDefinition = "VARCHAR(20)")
	@Size(max=20, message = "Maksimum 20 simvol yazmaq olar")
	@Pattern(regexp = "((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}", message = "Telefonu düzgün formatda yazın.(123-456-7890)")
	private String phone;
	
	@NotEmpty(message = "Xana doldurulmalıdır")
	@Column(columnDefinition = "VARCHAR(100)")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$", message = "Emaili düzgün formatda yazın")
	@Size(max=100, message = "Maksimum 100 simvol yazmaq olar")
	private String email;
	
	
	@Column(columnDefinition = "VARCHAR(100)")
	@Size(max=100, message = "Maksimum 100 simvol yazmaq olar")
	private String note;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", note=" + note + "]";
	}
	
}
