package kolegov.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", name + " " + surname);

        System.out.println(name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage() {
        return "first/bye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "firstNum", required = false) double fNum,
                             @RequestParam(value = "operator", required = false) String operator,
                             @RequestParam(value = "secondNum", required = false) double secNum,
                             Model model) {

        double result = 0;
        System.out.println(fNum + " " + secNum + " ");
        switch (operator) {
            case "add":
                result = fNum + secNum; break;

            case "mult":
                result = fNum * secNum; break;
        }

        System.out.println(result);
        model.addAttribute("result", result);

        return "calculator/calculator_page";
    }

}
