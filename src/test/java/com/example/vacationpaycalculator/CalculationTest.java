package com.example.vacationpaycalculator;

import com.example.vacationpaycalculator.model.CalculationData;
import com.example.vacationpaycalculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    void calculate() {
        CalculationData calculationData = new CalculationData(40000, 28);
        CalculatorService calculatorService = new CalculatorService();

        int result = (int) calculatorService.calculateVacationPay(calculationData);
        int expected = 38225;
        assertEquals(expected, result);
    }
}
