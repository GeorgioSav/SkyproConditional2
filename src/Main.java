public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("ПРОВЕРЬТЕ СВОЮ ОС!");
        }







        int year = 2012;
        boolean leapYear = (year % 400 == 0) || (year %4 == 0 && year % 100 != 0);
        if (leapYear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");




        int monthNumber = 1;

        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

        int clientOs = 0;
        int clientDeviceYear = 2015;

        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }





        int distance = 95;
        int time = -1;

        if (distance <= 20) {
            time = 1;
        } else if (distance > 20 && distance <=60) {
            time = 2;
        } else if (distance > 60 && distance <= 100) {
            time = 3;
        }
        System.out.println(time);
    }
}

