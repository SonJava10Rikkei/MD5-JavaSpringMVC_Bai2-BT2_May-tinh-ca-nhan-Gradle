package rikkei.academy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/", "/calculator"})
public class CalculateController {

    @GetMapping
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/calculator/calculation");
        System.out.println("aaaa");
        return modelAndView;
    }
}
