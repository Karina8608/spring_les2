package GB.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

    @Controller
public class HomeController {

    @GB.example.GetMapping()
    public String home(Model model) {
        model.addAttribute("message", "Добро пожаловать в наше приложение Spring Boot!");
        return "home";
    }
}