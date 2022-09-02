package com.behubble.ordersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.behubble.ordersystem.model.Pessoa;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        model.addAttribute("name", pessoa);
        model.addAttribute("escola", "IFTM");
        return "index";
    }

}
