package com.greenfoxacademy.matrix.controllers;

import com.greenfoxacademy.matrix.services.MatrixServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatrixController {
    private MatrixServiceImpl matrixService;

    public MatrixController(MatrixServiceImpl matrixService) {
        this.matrixService = matrixService;
    }

    @GetMapping("/") {

    }
}
