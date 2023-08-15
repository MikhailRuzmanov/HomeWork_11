import java.time.LocalDate;

class Homework {
    public  static void printYear_1(int year, int fourthYear, int hundredthYear, int fourHundredthYear){

        if (year % fourHundredthYear == 0 || year % fourthYear == 0 && year % hundredthYear != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static void choiseApp(int clientOS, int clientDeviceYear, int iOS, int android, int changeYear  ){
        if (clientOS == iOS && clientDeviceYear > changeYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear <= changeYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }if (clientOS == android && clientDeviceYear > changeYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android && clientDeviceYear <= changeYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите операционную систему: 0 - это iOS, 1 - это Android");
        }
    }

    public static void choiceDays(int deliveryDistance, int twentyKm,int sixtyKm, int oneHundredKm ,int days  ) {
        if (deliveryDistance <= twentyKm) {
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance >twentyKm && deliveryDistance<=sixtyKm) {
            days=days+1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance>sixtyKm && deliveryDistance<=oneHundredKm) {
            days=days+1+1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance>oneHundredKm) {
            System.out.println("Потребуется дней: " + "нет доставки");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }




    public static void task1() {
        System.out.println("Домашняя работа №11");
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        int year =2031;
        int fourthYear = 4;
        int hundredthYear = 100;
        int fourHundredthYear = 400;
        printYear_1(year, fourthYear, hundredthYear, fourHundredthYear);
        System.out.println("===== Конец задачи 1 =======");
    }

    private static void task2() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        int iOS = 0;
        int android = 1;
        int changeYear = 2015;
        choiseApp(clientOS, clientDeviceYear, iOS, android, changeYear);
        System.out.println("===== Конец задачи 2 =======");
    }
    private static void task3() {

        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        int deliveryDistance =95;
        int twentyKm = 20;
        int sixtyKm = 60;
        int oneHundredKm = 100;
        int days = 1;
        choiceDays(deliveryDistance, twentyKm, sixtyKm, oneHundredKm, days);
        System.out.println("===== Конец задачи 3 =======");
    }
}

