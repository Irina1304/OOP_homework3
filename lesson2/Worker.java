package lesson2;

public class Worker extends Employee {

    public Worker(String name, String surName, int age, double salary) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Возраст: %d; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f",
         surName, name, age, calculateSalary());
    }


    


}
