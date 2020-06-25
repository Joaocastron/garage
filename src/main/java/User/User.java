package User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String surname;
	private String phone;
	private String email;
	private String password;

	public User(String name, String surname, String phone, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSurname() {
		return surname;
	}

	protected void setSurname(String surname) {
		this.surname = surname;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

}
