package Controller;

import Model.model;
import Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class LoginController {
    @Autowired
    Repository repository;
    model model;

    private Service service;
    @GetMapping("login")
    public String login() {
        System.out.println("login");
        return service.loginservice();
    }
}
