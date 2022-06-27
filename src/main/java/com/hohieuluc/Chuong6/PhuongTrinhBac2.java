package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    int a;
    int b;
    int c;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a = scanner.nextInt();
        System.out.println("Nhap b: ");
        this.b = scanner.nextInt();
        System.out.println("Nhap c: ");
        this.c = scanner.nextInt();
        scanner.close();
    }

    public void ketQua() {
        float delta = (float) Math.pow(this.b, 2) - 4 * this.a * this.c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + ((float) -this.b / (2 * this.a)));
        } else {
            System.out.println("Phuong trinh co 2 nghiem: "
                    + ((float) (-this.b + Math.sqrt(delta)) / (2 * this.a))
                    + " va "
                    + ((float) (-this.b - Math.sqrt(delta)) / (2 * this.a)));
        }
    }

    public static void main(String[] args) {
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2();
        phuongTrinhBac2.nhap();
        phuongTrinhBac2.ketQua();
    }
}
