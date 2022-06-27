package com.hohieuluc.Chuong5;

import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        byte c;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap 1 ky tu: ");
            c = scanner.nextByte();
        }
        System.out.println("Ky tu vua nhap: " + (char) c);
    }
}
