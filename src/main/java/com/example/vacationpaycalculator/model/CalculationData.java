package com.example.vacationpaycalculator.model;

public class CalculationData {

    private double averageSalary;
    private int vacationDays;

    public CalculationData(double averageSalary, int vacationDays) {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }
}
