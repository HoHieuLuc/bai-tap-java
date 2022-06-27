package com.hohieuluc.Chuong8;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileInOutTest {
    final String filename = "D:\\BaiTap\\my-projects\\thuc-tap-java"
            + "\\thuctap\\src\\main\\java\\com\\hohieuluc\\Chuong8\\database.db";

    public void testWriteToFile() throws IOException {
        InputStream inputStream = System.in;
        ArrayList<Byte> input = new ArrayList<>();
        while (true) {
            try {
                int character = inputStream.read();
                if (character == '~') {
                    break;
                }
                input.add((byte) character);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            for (Byte b : input) {
                fileOutputStream.write(b);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fileOutputStream.close();
        }
    }

    public void testReadFromFile() throws IOException {
        FileInputStream fileInputStream = null;
        BufferedReader bufferReader = null;
        try {
            fileInputStream = new FileInputStream(filename);
            bufferReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fileInputStream.close();
            bufferReader.close();
        }
    }

    public void writeCustomers(ArrayList<Customer> customers) throws IOException {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            for (Customer customer : customers) {
                dataOutputStream.writeBytes(customer.toString());
                dataOutputStream.writeBytes("\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            dataOutputStream.close();
            fileOutputStream.close();
        }
    }

    public ArrayList<Customer> getCustomersFromFile() throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();

        FileInputStream fileInputStream = null;
        BufferedReader bufferReader = null;
        try {
            fileInputStream = new FileInputStream(filename);
            bufferReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
            String line;
            while ((line = bufferReader.readLine()) != null) {
                Customer customer = Customer.parseCustomerFromString(line);
                customers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fileInputStream.close();
            bufferReader.close();
        }

        return customers;
    }

    public void addCustomer() throws IOException {
        //ArrayList<Customer> customers = this.getCustomersFromFile();
        ArrayList<Customer> customers = new ArrayList<>();
        System.out.println("Nhap thong tin khach hang: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Customer customer = new Customer();
            customer.nhap(scanner);
            customers.add(customer);

            System.out.println("Dung nhap (q)?:");
            if (scanner.nextLine().equals("q")) {
                scanner.close();
                break;
            }
        }

        this.writeCustomers(customers);
    }

    public void listCustomer() throws IOException {
        this.testReadFromFile();
    }

    public void getCustomerByCode(String maKhachHang) throws IOException {
        ArrayList<Customer> customers = this.getCustomersFromFile();

        for (Customer customer : customers) {
            if (customer.getMaKhachHang().equals(maKhachHang)) {
                System.out.println(customer.toString());
                break;
            }
        }
    }

    public void deleteCustomerByCode(String maKhachHang) throws IOException {
        ArrayList<Customer> customers = this.getCustomersFromFile();

        ArrayList<Customer> customersFiltered = (ArrayList<Customer>) customers
                .stream()
                .filter(customer -> !customer.getMaKhachHang().equals(maKhachHang))
                .collect(Collectors.toList());

        this.writeCustomers(customersFiltered);
    }

    public void increaseTurnover(String maKhachHang, long sum) throws IOException {
        ArrayList<Customer> customers = this.getCustomersFromFile();

        customers.stream().map(customer -> {
            if (customer.getMaKhachHang().equals(maKhachHang)) {
                customer.setDoanhSo(customer.getDoanhSo() + sum);
            }
            return customer;
        }).collect(Collectors.toList());

        this.writeCustomers(customers);
    }

    public void sortedCustomer() throws IOException {
        ArrayList<Customer> customers = this.getCustomersFromFile();

        customers.sort((customer1, customer2) -> {
            return customer1.getMaKhachHang().compareTo(customer2.getMaKhachHang());
        });

        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void VIPCustomer() throws IOException {
        ArrayList<Customer> customers = this.getCustomersFromFile();

        // find customer with highest doanh so in array
        Customer vipCustomer = customers.stream()
                .max((customer1, customer2) -> {
                    return customer1.getDoanhSo() > customer2.getDoanhSo() ? 1 : -1;
                })
                .get();

        System.out.println(vipCustomer.toString());
    }

    public static void main(String[] args) throws IOException {
        FileInOutTest fileInOutTest = new FileInOutTest();

        // fileInOutTest.testWriteToFile(input);
        // fileInOutTest.testReadFromFile();
        fileInOutTest.addCustomer();
        // fileInOutTest.getCustomerByCode("kh002");
        // fileInOutTest.deleteCustomerByCode("kh002");
        // fileInOutTest.increaseTurnover("kh001", 100);
        // fileInOutTest.listCustomer();
        // fileInOutTest.sortedCustomer();
        // fileInOutTest.VIPCustomer();
    }
}
