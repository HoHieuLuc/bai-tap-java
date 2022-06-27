package com.hohieuluc.Chuong5;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String array[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }
 
        int i;
        do {
            System.out.println("Nhap so i: ");
            i = scanner.nextInt();
        } while (i < 0 || i > 9);
        System.out.println("Phan tu thu " + i + " trong mang: " + array[i]);
        scanner.close();
    }
}
