package kolegov.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMvcController {
    @GetMapping("/start-page")
    public String sayHello() {
        return "hello_world";
    }
}