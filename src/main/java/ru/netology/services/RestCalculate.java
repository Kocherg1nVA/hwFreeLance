package ru.netology.services;

public class RestCalculate {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0; // счетчик денег на счету
        int count = 0; // счетчик месяцев отдыха
                       // threshold - минимум денег необходимых для отдыха
        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

