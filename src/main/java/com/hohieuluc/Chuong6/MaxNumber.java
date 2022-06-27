package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        float soThuNhat;
        float soThuHai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        soThuNhat = scanner.nextFloat();
        System.out.println("Nhap so thu hai: ");
        soThuHai = scanner.nextFloat();
        scanner.close();
        
        if (soThuNhat > soThuHai) {
            System.out.println("So thu nhat lon hon so thu hai");
        } else if (soThuNhat < soThuHai) {
            System.out.println("So thu hai lon hon so thu nhat");
        } else {
            System.out.println("So thu nhat bang so thu hai");
        }
    }
}
