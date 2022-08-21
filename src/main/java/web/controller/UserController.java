package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.repositories.UserRepository;
import web.service.UserService;

@Controller
@RequestMapping(name = "/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String users(Model model) {
        model.addAttribute("Users", userService.findAll());
        return "users";
    }
}
