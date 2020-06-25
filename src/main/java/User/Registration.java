package User;

public class Registration {

	private String name;

	private String surname;

	private String phone;

	private String email;

	private String password;

	public Registration(String name, String surname, String phone, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	protected Registration() {
		// TODO Auto-generated constructor stub
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
