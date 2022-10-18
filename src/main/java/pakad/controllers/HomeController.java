package pakad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home.html";
    }

    @GetMapping("/main")
    public String mains() {
        return "main.html";
    }

}
