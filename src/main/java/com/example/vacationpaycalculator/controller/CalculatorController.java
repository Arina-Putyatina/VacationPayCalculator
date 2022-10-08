package com.example.vacationpaycalculator.controller;

import com.example.vacationpaycalculator.model.CalculationData;
import com.example.vacationpaycalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/calculacte")
    public double calculateVacationPay(@RequestParam("averageSalary") double averageSalary, @RequestParam("vacationDays") int vacationDays) {
        CalculationData calculationData = new CalculationData(averageSalary, vacationDays);
        return service.calculateVacationPay(calculationData);
    }

}
