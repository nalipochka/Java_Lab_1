package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a task: ");
        int task = scanner.nextInt();
        switch (task){
            case 1:{
                System.out.println("---1---");
                System.out.println("Fall seven times\nand\nstand up eight");
            }
            break;
            case 2:{
                System.out.println("---2---");
                System.out.println("Enter first number: ");
                double number = scanner.nextDouble();
                System.out.println("Enter percent: ");
                double percent = scanner.nextDouble();
                double result = (percent /100) *number;
                System.out.println(percent + "% on " + number + " = " + result);
            }
            case 3:{
                System.out.println("---3---");
                System.out.println("Enter first number: ");
                int num1 = scanner.nextInt();
                int reversedNumber = reverseNumber(num1);
                System.out.println("Result:" + reversedNumber);
            }
            break;
            case 4:{
                System.out.println("Enter number of hours: ");
                int hours = scanner.nextInt();
                if(hours >= 0 && hours<6){
                    System.out.println("Good night!");
                } else if (hours >= 6 && hours<13) {
                    System.out.println("Good Morning!");
                } else if (hours >= 13 && hours<17) {
                    System.out.println("Good Day!");
                } else if (hours >= 17 && hours<24) {
                    System.out.println("Good Evening!");
                }else {
                    System.out.println("Error!");
                }

            }
            break;
            case 5:{
                System.out.print("Введіть шестизначне число: ");
                int number = scanner.nextInt();
                if (number >= 100000 && number <= 999999) {
                    int sumFirstThreeDigits = 0;
                    int sumLastThreeDigits = 0;

                    for (int i = 0; i < 6; i++) {
                        int digit = number % 10;
                        number /= 10;
                        if (i < 3) {
                            sumFirstThreeDigits += digit;
                        } else {
                            sumLastThreeDigits += digit;
                        }
                    }
                    if (sumFirstThreeDigits == sumLastThreeDigits) {
                        System.out.println("Це щасливе число!");
                    } else {
                        System.out.println("Це не щасливе число.");
                    }
                } else {
                    System.out.println("Введіть шестизначне число.");
                }
            }
            break;
            case 6:{

                System.out.print("Введіть число в діапазоні від 1 до 100: ");
                int number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.println("Fizz Buzz");
                    } else if (number % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (number % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(number);
                    }
                } else {
                    System.out.println("Помилка: число не в діапазоні від 1 до 100");
                }
            }
            break;
            case 7:{
                System.out.print("Введіть число для обчислення факторіала: ");
                int n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Факторіал визначений тільки для невід'ємних чисел.");
                } else {
                    long factorial = 1;

                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }

                    System.out.println("Факторіал числа " + n + " дорівнює " + factorial);
                }
            }
            break;
            case 8:{
                System.out.print("Введіть початок діапазону: ");
                int start = scanner.nextInt();

                System.out.print("Введіть кінець діапазону: ");
                int end = scanner.nextInt();

                System.out.println("Прості числа в діапазоні від " + start + " до " + end + ":");

                for (int number = start; number <= end; number++) {
                    if (isPrime(number)) {
                        System.out.print(number + " ");
                    }
                }
            }
            break;
            case 9:{
                System.out.print("Введіть розмір масиву: ");
                int size = scanner.nextInt();

                int[] array = new int[size];

                System.out.println("Введіть елементи масиву:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Елемент " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }

                int sum = 0;
                for (int num : array) {
                    sum += num;
                }
                double average = (double) sum / size;

                System.out.println("Елементи масиву:");
                for (int num : array) {
                    System.out.print(num + " ");
                }

                System.out.println("\nСума елементів масиву: " + sum);
                System.out.println("Середнє арифметичне: " + average);
            }
            break;
            case 10:{
                System.out.print("Введіть розмір масиву: ");
                int size = scanner.nextInt();

                int[] array = new int[size];

                System.out.println("Введіть елементи масиву:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Елемент " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }

                System.out.print("Введіть число для підрахунку: ");
                int targetNumber = scanner.nextInt();

                int count = 0;
                for (int num : array) {
                    if (num == targetNumber) {
                        count++;
                    }
                }

                System.out.println("Число " + targetNumber + " зустрічається в масиві " + count + " разів.");

            }
            break;
            case 11:{
                int start = 1;
                int end = 10;

                int sum = calculateSum(start, end);

                System.out.println("Сума чисел у діапазоні від " + start + " до " + end + " дорівнює " + sum);
            }
            break;
            case 12:{
                int[] inputArray = {1, 2, 3, 4, 5};
                int[] factorialArray = calculateFactorials(inputArray);

                System.out.print("Факторіали елементів масиву: ");
                for (int i = 0; i < factorialArray.length; i++) {
                    System.out.print(factorialArray[i] + " ");
                }
            }
            break;
            default:
                System.out.println("Error!");
        }
        scanner.close();
    }
    public static int reverseNumber(int num){
        int reversedNum = 0;
        while(num!=0){
            int digit = num %10;
            reversedNum = reversedNum*10+digit;
            num /=10;
        }
        return reversedNum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int calculateSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
    public static int[] calculateFactorials(int[] array) {
        int[] factorialArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            factorialArray[i] = calculateFactorial(array[i]);
        }

        return factorialArray;
    }

    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факторіал визначений тільки для невід'ємних чисел.");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}