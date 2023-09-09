package lesson2;

public abstract class Employee implements Comparable<Employee> {

    protected String surName;
    protected String name;
    protected double salary;
    protected int age;


    public Employee(String name, String surName, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return String.format("%s %s %d", surName, name, age);
    }

    /*
    Сортировка по фамилии и имени
    @Override
    public int compareTo(Employee o){
        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }
    */

    /*Сортировка пo возрасту и уровню зп */

    @Override
    public int compareTo(Employee o) {
        int res = Integer.compare(age,o.age);
        if(res == 0) {
            return Double.compare(calculateSalary(),o.calculateSalary());
        }
        return res;
    }


    
}
