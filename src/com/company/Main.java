package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientIos = 0;
        int clientAndroid = 1;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        if (clientIos == 0 && clientDeviceYear >= 2015)
        {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientIos==0&&clientDeviceYear<2015); {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (clientAndroid==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientAndroid==1 && clientDeviceYear<2015);{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задача 3
        int year=2016;
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
        //Задача 4
        int deliveryDistance=75;
        int days=1;
        if (deliveryDistance<=20){
            System.out.println("Потребуется дней " + days);
        }
         if (deliveryDistance>20 && deliveryDistance<=60){
            System.out.println("Потребуется дней " + (days+1));
        }if (deliveryDistance>60 && deliveryDistance<=100){
            System.out.println("Потребуется дней " + (days+2));
        } else {
            System.out.println("Не доставляем");
        }
         // Задача 5
        int monthNumber=13;
         switch (monthNumber){
             case 12:
             case 1:
             case 2:
                 System.out.println("Зима");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Весна");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Осень");
                 break;
             default:
                 System.out.println("Такого месяца не существует");
         }
        }
    }

