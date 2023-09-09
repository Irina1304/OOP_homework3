package lesson2;

public class Freelancer extends Employee {


    public Freelancer(String name, String surName, int age, double salary) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary(){
        return salary * 0.5;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f",
         surName, name, age, calculateSalary());
    }


    
}
