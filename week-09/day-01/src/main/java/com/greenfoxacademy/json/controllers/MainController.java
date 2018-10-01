package com.greenfoxacademy.json.controllers;

import com.greenfoxacademy.json.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String displayMain() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubling doublingMethod(@RequestParam("input") Long input) {
        Doubling doubling = new Doubling();
        if (input == null) {
            doubling.setError("Please provide an input!");
            return doubling;
        }
        doubling.setReceived(input);
        doubling.setResult(input * 2);
        return doubling;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeting greetingMethod(@RequestParam("name") String name, @RequestParam("title") String title) {
        if (name.isEmpty() && title.isEmpty()) {
            return new Greeting("null", "Please provide a name and a title!");
        }
        if (name.isEmpty()) {
            return new Greeting("null", "Please provide a name!");
        }
        if (title.isEmpty()) {
            return new Greeting("null", "Please provide a title!");
        }
        return new Greeting("Oh, hi there " + name + ", my dear " + title);
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Append appendWith(@PathVariable String appendable) {
        return new Append(appendable + "a");
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Result doUntil(@PathVariable String action, @RequestBody Until until) {
        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 0; i <= until.getUntil(); i++) {
                sum = sum + i;
            }
            Result result = new Result(sum);
            return result;
        }

        if (action.equals("factor")) {
            int factor = 1;
            for (int i = 1; i <= until.getUntil(); i++) {
                factor = factor * i;
            }
            Result result = new Result(factor);
            return result;
        }
        return new Result("Please provide a number!");
    }

    @PostMapping("/arrays")
    @ResponseBody
    public ArrayResult arrayHandler(@RequestBody ArrayInput arrayInput) {
        if (arrayInput.getWhat().equals("sum")) {
            Integer sum = 0;
            for (int i = 0; i <= arrayInput.getNumbers().size(); i++) {
                sum = sum + i;
            }
            ArrayResult arrayResult = new ArrayResult(sum);
            return arrayResult;
        }

        if (arrayInput.getWhat().equals("multiply")) {
            int multiply = 1;
            for (int i = 1; i <=arrayInput.getNumbers().size(); i++) {
                multiply = multiply * i;
            }
            ArrayResult arrayResult = new ArrayResult(multiply);
            return arrayResult;
        }

        if (arrayInput.getWhat().equals("double")) {
            for (int i = 0; i <; i++) {

            }

        }
        return new ArrayResult(doubling);

        return new ArrayResult("Please provide what to do with the numbers!");
    }
}
