package com.ajtechie.banking;

public class BankingMain {
    public static void main(String Args[]){

        BankAccount b1 = new BankAccount(101,"ajith",100000);
        BankAccount b2 = new BankAccount(102,"praveen",100000);

        b1.deposit(1500);
        b1.deposit(20000);
        b1.withdraw(1000);
        b1.withdraw(500);
        System.out.println(".......");
        TransactionDetails.showMiniStatement(101);
    }
}
