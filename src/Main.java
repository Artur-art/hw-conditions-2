public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int iosClient = 1;
        int androidClient = 0;
        if (iosClient == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (androidClient == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача №2");
        int clientOS = 0;
        int yearRelease = 2015;
        if (yearRelease < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearRelease >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (yearRelease < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (yearRelease >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача №3");
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год високосный");
        } else {
            System.out.println("Год не високосный");
        }

        System.out.println("Задача №4");
        int distance = 91;
        if (distance <= 20) {
            System.out.println("Доставка займет 1 день");
        }else if (distance >= 20 && distance <= 60) {
            System.out.println("доставка займет 2 дня");
        }else if (distance >= 60 && distance <= 100){
            System.out.println("Доставка займет 3 дня");
        }

        System.out.println("Задача №5");
        int mounthNumber = 25;
        if (mounthNumber == 1){
            System.out.println("Месяц январь");
        } else if (mounthNumber == 2){
            System.out.println("Месяц февраль");
        } else if (mounthNumber == 3) {
            System.out.println("Месяц март");
        } else if (mounthNumber == 4) {
            System.out.println("месяц апрель");
        } else if (mounthNumber == 5) {
            System.out.println("Месяц май");
        } else if (mounthNumber == 6) {
            System.out.println("Месяц июнь");
        } else if (mounthNumber == 7) {
            System.out.println("Месяц июль");
        } else if (mounthNumber == 8) {
            System.out.println("Месяц август");
        } else if (mounthNumber == 9) {
            System.out.println("Месяц сентябрь");
        } else if (mounthNumber == 10) {
            System.out.println("Месяц октябрь");
        } else if (mounthNumber == 11) {
            System.out.println("Месяц ноябрь");
        } else if (mounthNumber == 12) {
            System.out.println("Месяц декабрь");
        } else if (mounthNumber > 12) {
            System.out.println("Такого месяца не существует");
        }

        }

    }






