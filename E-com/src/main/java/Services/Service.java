package Services;

import Controller.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Service
public class Service {
@Autowired
    LoginController  loginController;

    public String loginservice() {

    }
}
