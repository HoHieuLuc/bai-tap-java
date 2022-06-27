package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class NumberCheck {
    int num;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap num: ");
        this.num = scanner.nextInt();
        scanner.close();
    }

    public void isPositive() {
        if (this.num > 0) {
            System.out.println("Num la so duong");
        } else if (this.num == 0) {
            System.out.println("Num la so 0");
        } else {
            System.out.println("Num la so am");
        }
    }

    public void isOdd() {
        if (this.num % 2 == 0) {
            System.out.println("Num la so chan");
        } else {
            System.out.println("Num la so le");
        }
    }

    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        numberCheck.input();
        numberCheck.isPositive();
        numberCheck.isOdd();
    }
}
