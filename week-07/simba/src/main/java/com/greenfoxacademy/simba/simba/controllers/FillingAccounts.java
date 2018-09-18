package com.greenfoxacademy.simba.simba.controllers;

import com.greenfoxacademy.simba.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class FillingAccounts {
    ArrayList<BankAccount> list = new ArrayList<>();

    @RequestMapping("/fillingaccounts")
    public String ex1(Model model) {
        list.add(new BankAccount("Timon", 1000, "Apple", "Meerkat"));
        list.add(new BankAccount("Pumba", 500, "Bug", "Warthog"));
        list.add(new BankAccount("Nala", 1500, "Zebra", "Lion"));
        list.add(new BankAccount("Musafa", 800, "Zebra", "Lion"));
        model.addAttribute("bankList", list);
        return "fillingaccounts";
    }
}

