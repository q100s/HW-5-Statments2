public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Download iOS app by the following link");
        } else {
            System.out.println("Download Android app by the following link");
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 0;
        int clientDeviceYear = 2010;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Download iOS app by the following link");
            } else {
                System.out.println("Download the light version of iOS app by the following link");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Download Android app by the following link");
            } else {
                System.out.println("Download the light version of Android app by the following link");
            }
        }
    }
    public static void task3() {
        System.out.println("Task 3");
        int year = 400;
        if (year % 4  == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 15;
        int deliveryDays = 1;

        if (deliveryDistance >= 20) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60) {
            deliveryDays++;
        }
        System.out.println("Delivery will take: " + deliveryDays);
        if (deliveryDistance >= 100){
            System.out.println("There isn't delivery");
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("It's winter!");
                break;
            case 3, 4, 5:
                System.out.println("It's spring");
                break;
            case 6, 7, 8:
                System.out.println("It's summer");
                break;
            case 9, 10, 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("It isn't a month");
        }
    }
}