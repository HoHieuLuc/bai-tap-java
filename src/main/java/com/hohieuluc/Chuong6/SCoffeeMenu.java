package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class SCoffeeMenu extends CoffeeMenu{
    public Coffee chonCoffee(int soThuTuCoffee) {
        switch (soThuTuCoffee) {
            case 1:
                return coffeeMenu.get(0);
            case 2:
                return coffeeMenu.get(1);
            case 3:
                return coffeeMenu.get(2);
            case 4:
                return coffeeMenu.get(3);
            case 5:
                return coffeeMenu.get(4);
            default:
                return null;
        }
    }


    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.inMenu();

        Scanner scanner = new Scanner(System.in);
        int soThuTuCoffee;
        do {
            System.out.println("Chon loai coffee: ");
            soThuTuCoffee = scanner.nextInt();
        } while (soThuTuCoffee < 1 ||  soThuTuCoffee > coffeeMenu.coffeeMenu.size());

        SCoffeeMenu scoffeeMenu = new SCoffeeMenu();
        Coffee coffee = scoffeeMenu.chonCoffee(soThuTuCoffee);
        System.out.println("Chon so luong: ");
        int soLuong = scanner.nextInt();
        coffeeMenu.inHoaDon(coffee, soLuong);

        scanner.close();
    }
}
