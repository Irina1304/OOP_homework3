package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов",
         "Лыткин", "Соколов" };
        
        int[] age = new int[] {20, 30, 40, 50};
        
        int salaryIndex = random.nextInt(500, 900);

        int typeOfEmployee = random.nextInt(0,2);



        if (typeOfEmployee == 0){
        return
                new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age[random.nextInt(age.length)], salaryIndex*100);
        }
        else{
            return
                new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age[random.nextInt(age.length)], salaryIndex*100);
        }

    }

    public static Employee[] generateEmployee(int counter){
        Employee[] workers = new Employee[counter];
        for (int i = 0; i < workers.length; i++){
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateEmployee(12);

        for (Employee worker : workers) {
            System.out.println(worker);
            
        }

        Arrays.sort(workers);

        System.out.println();

        for (Employee worker : workers) {
            System.out.println(worker);
            
        }
        
    }
    
}
