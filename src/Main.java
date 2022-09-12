import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lesson 1
        double year;
        //System.out.println("введите год -> "); //  ввод с консоли
        //Scanner input = new Scanner(System.in);        //  ввод с консоли
        //year=input.nextDouble();                       //  ввод с консоли
        //year = 2020;
        //year = 2021;
        //year = LocalDate.now().getYear();

        System.out.println(isLeapYear(year)); // isLeapYear() метод
        System.out.println(" ");

        //lesson 2
        int clientDeviceYear = 2022;
        int typeOS = 0;
        System.out.println(VersionOs(typeOS, clientDeviceYear)); // VersionOs() метод ить
        System.out.println(" ");

        //lesson3
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + deliveryDay(deliveryDistance)); // deliveryDay() метод
        System.out.println(" ");
    }

    public static String isLeapYear(Double year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return "" + (String.format("%.0f", year)) + " - високосный год";
        } else {
            return "" + (String.format("%.0f", year)) + " - не високосный год";
        }
    }

    public static String VersionOs(int typeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear(); // узнаём год для сравнения

        if (typeOS == 0 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (typeOS == 1 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (typeOS == 0 && clientDeviceYear >= currentYear) {
            return "Установите версию приложения для iOS по ссылке";
        }
        if (typeOS == 1 && clientDeviceYear >= currentYear) {
            return "Установите версию приложения для Android по ссылке";
        }
        return "";

    }

    public static int deliveryDay(int deliveryDistance) {
        int deliveryTime = 999999999;
        if (deliveryDistance <= 100) {
            deliveryTime = 3;
        }
        if (deliveryDistance < 60) {
            deliveryTime = 2;
        }
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        }
        return deliveryTime;
    }
}


