package com.gourav.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();

        acc.setAccNumber("7927452523");
        acc.deposit(10000);
        acc.withdraw(5923);

        System.out.println("Acc Number: " + acc.getAccNumber());
        System.out.println("Remaining Balance: " +  acc.getBalance());
    }
}

class BankAcc {
    private String accNumber;
    private double balance;

    public void setAccNumber(String accNum) {
        this.accNumber = accNum;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}