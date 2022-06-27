package com.hohieuluc.Chuong7;

import java.util.Scanner;

import com.hohieuluc.Chuong6.Coffee;
import com.hohieuluc.Chuong6.CoffeeMenu;

public class SMenu {
    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.addCoffee(new Coffee("Ngung dat", 0));
        coffeeMenu.inMenu();
        Scanner scanner = new Scanner(System.in);
        int soThuTuCoffee;
        do {
            soThuTuCoffee = coffeeMenu.chonSoThuTuCoffe(scanner);
            if (soThuTuCoffee == coffeeMenu.getCoffeeMenu().size()) {
                System.out.println("Ngung dat");
                break;
            }
            int soLuong = coffeeMenu.chonSoLuong(scanner);

            coffeeMenu.inHoaDon(coffeeMenu.getCoffeeBySoThuTu(soThuTuCoffee), soLuong);
        } while (true);

        scanner.close();
    }
}
