package com.greenfoxacademy.simba.simba.controllers;

import com.greenfoxacademy.simba.simba.model.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show {

    @RequestMapping("/show")
    public String show (Model model){
        model.addAttribute("account" ,new BankAccount("Simba", 2000, "Zebra", "Lion"));
        model.addAttribute("print", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "show";
    }


}
