package org.aliomamdouh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm() {
        return "main-menu";
    }

    @RequestMapping(value = "/math", method = RequestMethod.POST)
    public String math(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);

        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" * "+num2+" = "+product);
        return "result";
    }
}
