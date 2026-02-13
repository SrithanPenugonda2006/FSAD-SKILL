package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calcService.add(a, b);
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return calcService.subtract(a, b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return calcService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return calcService.divide(a, b);
    }
    
    @GetMapping("/modulo")
    public int modulo(@RequestParam int a, @RequestParam int b) {
        return calcService.modulo(a, b);
    }
    
}