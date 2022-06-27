package com.hohieuluc.Chuong6;

import java.util.Scanner;

public class SCoffeeMenu {
    public Coffee getCoffeeBySoThuTu(CoffeeMenu coffeeMenu, int soThuTuCoffee) {
        switch (soThuTuCoffee) {
            case 1:
                return coffeeMenu.getCoffeeMenu().get(0);
            case 2:
                return coffeeMenu.getCoffeeMenu().get(1);
            case 3:
                return coffeeMenu.getCoffeeMenu().get(2);
            case 4:
                return coffeeMenu.getCoffeeMenu().get(3);
            case 5:
                return coffeeMenu.getCoffeeMenu().get(4);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.inMenu();

        Scanner scanner = new Scanner(System.in);
        int soThuTuCoffee = coffeeMenu.chonSoThuTuCoffee(scanner);
        int soLuong = coffeeMenu.chonSoLuong(scanner);
        scanner.close();

        SCoffeeMenu scoffeeMenu = new SCoffeeMenu();
        Coffee coffee = scoffeeMenu.getCoffeeBySoThuTu(coffeeMenu, soThuTuCoffee);

        coffeeMenu.inHoaDon(coffee, soLuong);
    }
}
