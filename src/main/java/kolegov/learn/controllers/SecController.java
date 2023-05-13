package kolegov.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecController {

    @GetMapping("/exit")
    public String exitPage(){
        return "first/exit";
    }


}
