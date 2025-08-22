package ru.netology.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int balance = 0; // начальный баланс
        int vacationMonths = 0; // счетчик месяцев отдыха

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                // Выбираем отдых
                balance -= expenses; // обязательные траты
                balance /= 3; // траты на отдых (уменьшение в 3 раза)
                vacationMonths++;
            } else {
                // Выбираем работу
                balance += income - expenses;
            }
        }

        return vacationMonths;
    }
}