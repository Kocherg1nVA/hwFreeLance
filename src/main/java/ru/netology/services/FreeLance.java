package ru.netology.services;

public class FreeLance {
    public static void main(String[] args) {
        RestCalculate service = new RestCalculate();
        System.out.println("Месяцев отдыха в году: " + service.calculate(10_000,
                3_000, 20_000));
        System.out.println("Месяцев отдыха в году: " + service.calculate(100_000,
                60_000, 150_000));
    }
}