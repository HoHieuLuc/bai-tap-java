package com.hohieuluc.Chuong6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMenu {
    List<Coffee> coffeeMenu;

    public List<Coffee> getCoffeeMenu() {
        return this.coffeeMenu;
    }

    public CoffeeMenu() {
        this.coffeeMenu = new ArrayList<Coffee>() {
            {
                add(new Coffee("Cappuccino", 5.0f));
                add(new Coffee("Latte", 4.2f));
                add(new Coffee("Mocha", 3.3f));
                add(new Coffee("Americano", 2.1f));
                add(new Coffee("Cafe Mocha", 1.0f));
            }
        };
    }

    public void inMenu() {
        for (int i = 0; i < coffeeMenu.size(); i++) {
            System.out.println(i + 1 + ". " + coffeeMenu.get(i).loaiCoffee + ": " + coffeeMenu.get(i).gia);
        }
    }

    public void inHoaDon(Coffee coffee, int soLuong) {
        System.out.println("Hoa don: " + coffee.loaiCoffee + ", gia: " + coffee.gia * soLuong);
    }

    public int chonSoThuTuCoffee(Scanner scanner) {
        int soThuTuCoffee;
        do {
            System.out.println("Chon loai coffee: ");
            soThuTuCoffee = scanner.nextInt();
        } while (soThuTuCoffee < 1 || soThuTuCoffee > coffeeMenu.size());

        return soThuTuCoffee;
    }

    public int chonSoLuong(Scanner scanner) {
        int soLuong;
        do {
            System.out.println("Chon so luong: ");
            soLuong = scanner.nextInt();
        } while (soLuong < 1);

        return soLuong;
    }

    public void addCoffee(Coffee coffee) {
        this.coffeeMenu.add(coffee);
    }

    public Coffee getCoffeeBySoThuTu (int soThuTuCoffee) {
        return this.coffeeMenu.get(soThuTuCoffee - 1);
    }

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.inMenu();
        Scanner scanner = new Scanner(System.in);

        int soThuTuCoffee = coffeeMenu.chonSoThuTuCoffee(scanner);
        int soLuong = coffeeMenu.chonSoLuong(scanner);
        
        scanner.close();

        coffeeMenu.inHoaDon(coffeeMenu.getCoffeeBySoThuTu(soThuTuCoffee), soLuong);
    }
}
