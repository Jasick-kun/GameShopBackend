package kz.project.gameshopbackend.Controller;

import kz.project.gameshopbackend.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

@RestController
@PermitAll
@RequestMapping("/login")
public class UserController {

    @PostMapping("/")
    public HttpStatus logIn(@RequestBody User user){
        System.out.println(user);
        return HttpStatus.OK;
    }
}
