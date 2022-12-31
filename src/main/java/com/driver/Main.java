package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            CurrentAccount obj = new CurrentAccount("Erwin", 6000, "YZX");
            System.out.println(obj.getTradeLicenseId());
            obj.withdraw(500);
            obj.deposit(200);
            obj.validateLicenseId();
            System.out.println(obj.getBalance());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}