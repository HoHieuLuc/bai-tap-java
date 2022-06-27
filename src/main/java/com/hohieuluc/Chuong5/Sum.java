package com.hohieuluc.Chuong5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        scanner.close();

        // print sum, sub, mul, div, mod
        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        System.out.println("Thuong: " + (a / b));
        System.out.println("Chia lay du: " + (a % b));

    }
}
