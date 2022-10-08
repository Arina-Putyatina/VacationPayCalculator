package com.example.vacationpaycalculator.service;

import com.example.vacationpaycalculator.model.CalculationData;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculateVacationPay(CalculationData calculationData) {
        if (calculationData.getVacationDays() == 0) {
            return 0;
        }
        double days = 12 * 29.3;
        double dayCost = calculationData.getAverageSalary() * 12 / days;
        return dayCost * calculationData.getVacationDays();
    }
}
