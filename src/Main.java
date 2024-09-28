public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача №1");
        for (int t = 1; t < 11; t++) {
            System.out.println(t);
        }
        //Задача 2
        System.out.println("Задача №2");
        for (int t = 10; t > 0; t--) {
            System.out.println(t);
        }
        //Задача 3
        System.out.println("Задача №3");
        for (int t = 0; t < 17; t = t + 2) {
            System.out.println(t);
        }
        //Задача 4
        System.out.println("Задача №4");
        for (int t = 10; t > -11; t--) {
            System.out.println(t);
        }
        //Задача 5
        System.out.println("Задача №5");
        for (int t = 1904; t < 2097; t = t + 4) {
            System.out.println(t + " год является високосным");
        }
        //Задача 6
        System.out.println("Задача №6");
        for (int t = 7; t < 100; t = t + 7) {
            System.out.println(t);
        }
        //Задача 7
        System.out.println("Задача №7");
        for (int t = 1; t < 513; t = t * 2) {
            System.out.println(t);
        }
        //Задача 8
        System.out.println("Задача №8");
        int salary = 29000;
        int savings = 0;
        for (int t = 1; t < 13; t++) {
            savings = savings + salary;
            System.out.println("Месяц " + t + ", сумма накоплений равна " + savings + " рублей");
        }
        //Задача 9
        System.out.println("Задача №9");
        int salary1 = 29000;
        int savings1 = 0;
        for (int t = 1; t < 13; t++) {
            savings1 = savings1 + savings1 / 100;
            savings1 = savings1 + salary1;
            System.out.println("Месяц " + t + ", сумма накоплений равна " + savings1 + " рублей");
        }
        //Задача 10
        System.out.println("Задача №10");
        int c = 2;
        for (int t = 1; t < 11; t++) {
            System.out.println("2*" + t + "=" + c);
            c = c + 2;
        }
    }
}