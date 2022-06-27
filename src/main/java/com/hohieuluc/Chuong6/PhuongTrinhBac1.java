package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    int a;
    int b;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a = scanner.nextInt();
        System.out.println("Nhap b: ");
        this.b = scanner.nextInt();
        scanner.close();
    }

    public void giaiPhuongTrinh() {
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co 1 nghiem: " + ((float)-this.b / this.a));
        }
    }

    public static void main(String[] args) {
        PhuongTrinhBac1 phuongTrinhBac1 = new PhuongTrinhBac1();
        phuongTrinhBac1.nhap();
        phuongTrinhBac1.giaiPhuongTrinh();
    }
}
