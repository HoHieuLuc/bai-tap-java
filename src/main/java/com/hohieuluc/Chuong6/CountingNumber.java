package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class CountingNumber {

    public void printNumberInEnglish(char c) {
        int number = c - '0';
        System.out.println(c + ", " + number);
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Not a number");
                break;
        }
    }

    public static void main(String[] args) {
        char num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so tu 0 den 9: ");
        num = scanner.nextLine().charAt(0);

        scanner.close();

        CountingNumber countingNumber = new CountingNumber();
        countingNumber.printNumberInEnglish(num);
    }
}
