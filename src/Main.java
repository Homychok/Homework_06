public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
    }
    public static void printYear() {
        int year = 2020;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void clientDeviceYear() {
        int clientDeviceYear = 2015;
        int deviceOS = 1;
        if (deviceOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (deviceOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceOS != 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void deliveryDistance() {
        int deliveryDistance = 95;
        int timeDelivery1 = 1;
        int timeDelivery2 = 2;
        int timeDelivery3 = 3;
        if (deliveryDistance <= 20 ) {
            System.out.println("Потребуется дней: " + timeDelivery1);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + timeDelivery3);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + timeDelivery2);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void homework1() {
        System.out.println("Домашняя задача 1");
        printYear();
    }
    public static void homework2() {
        System.out.println("Домашняя задача 2");
        clientDeviceYear();
    }
    public static void homework3() {
        System.out.println("Домашняя задача 3");
        deliveryDistance();
    }
}