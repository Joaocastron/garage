package User;

import org.springframework.stereotype.Service;

@Service
public class UserCreation implements RegistrationInter {

	private Repository Repository;

	public UserCreation(Repository repository) {
		super();
		Repository = repository;
	}

	@Override
	public User save(Registration Registraiton) {
		// TODO Auto-generated method stub

		User user = new User(Registraiton.getName(), Registraiton.getSurname(), Registraiton.getPhone(),
				Registraiton.getEmail(), Registraiton.getPassword());

		return Repository.save(user);
	}

}
