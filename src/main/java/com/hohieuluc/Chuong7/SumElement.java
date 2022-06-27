package com.hohieuluc.Chuong7;

import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        int soNguyenS;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen S lon hon 1: ");
            soNguyenS = scanner.nextInt();
        } while (soNguyenS < 1);
        scanner.close();

        int sum = 0;
        int index = 1;
        while (sum <= soNguyenS) {
            sum += index;
            index++;
        }

        System.out.println("Sum: " + sum);
    }
}
