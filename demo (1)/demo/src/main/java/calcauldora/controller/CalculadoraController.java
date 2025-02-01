package com.controllers;  

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    @GetMapping("/operar")
    public double calcular(@RequestParam double num1, @RequestParam double num2, @RequestParam String operador) {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num2 != 0 ? num1 / num2 : 0;
            default: throw new IllegalArgumentException("Operador inválido!");
        }
    }
}
