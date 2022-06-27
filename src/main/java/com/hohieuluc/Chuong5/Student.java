package com.hohieuluc.Chuong5;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String fullname;
        int yearOfBirth;
        String address;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        fullname = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        yearOfBirth = scanner.nextInt();
        System.out.println("Nhap dia chi: ");
        scanner.nextLine();
        address = scanner.nextLine();
        scanner.close();

        System.out.println("Ho ten: " + fullname);
        System.out.println("Nam sinh: " + yearOfBirth);
        System.out.println("Dia chi: " + address);

    }
}
