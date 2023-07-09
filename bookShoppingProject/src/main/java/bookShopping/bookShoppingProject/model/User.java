package bookShopping.bookShoppingProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Size(min = 1, message = "İstifadəçi adı minimum 1 simvoldan ibarət olmalıdır")
	@Size(max = 15, message = "İstifadəçi adı 15 simvoldan çox olmamalıdır")
	@NotEmpty(message = "Xana doldurulmalıdır")
	private String username;
	
	@Size(min = 1, message = "Şifrə minimum 1 simvoldan ibarət olmalıdır")
	@Size(max = 30, message = "Şifrə 30 simvoldan çox olmamalıdır")
	@NotEmpty(message = "Xana doldurulmalıdır")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
}
