package User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {
	
	private RegistrationInter registrationInter;

	public UserController(RegistrationInter registrationInter) {
		super();
		this.registrationInter = registrationInter;
	}
	
	@ModelAttribute ("user")
	public Registration Registration() {
		
		return new Registration();
	}
	
	@GetMapping
	public String RegistrationForm() {
		
		return "registration";
	}
	
	@PostMapping
	public String userRegistration (@ModelAttribute ("user") Registration registration) {
		
		registrationInter.save(registration);
		
		return "redirect:/registraiton?sucess";
	}

}
