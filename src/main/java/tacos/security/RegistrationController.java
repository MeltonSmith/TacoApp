package tacos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.data.UserRepository;

/**
 * @Author Melton Smith
 * @Since 30.08.2020
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
    private UserRepository userRepo;
//    private PasswordEncoder passwordEncoder;

//    @Autowired
//    public RegistrationController(
//            UserRepository userRepo, PasswordEncoder passwordEncoder) {
//        this.userRepo = userRepo;
//        this.passwordEncoder = passwordEncoder;
//    }

    public RegistrationController(
            UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
//        userRepo.save(form.toUser(passwordEncoder));
        userRepo.save(form.toUser());
        return "redirect:/login";
    }
}
