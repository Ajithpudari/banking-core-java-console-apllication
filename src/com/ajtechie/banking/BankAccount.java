package com.ajtechie.banking;

import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private int accBalance;

    public BankAccount(int accountNumber, String customerName, int accBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accBalance = accBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public BankAccount() {
    }
     public void deposit(int depositAmount){
         Random r= new Random();
        accBalance += depositAmount;
        //after deposit we need store detaols in object details in object class

         Transaction t = new Transaction(r.nextInt(),
                 accountNumber, depositAmount, "deposit",accBalance);
         TransactionDetails.addTransaction(t);
         System.out.println("deposit Completed");

     }


     public void withdraw(int withdrawAmount){
         Random r= new Random();
        if(withdrawAmount > accBalance){
            try {
                throw new InsufficentBalanceException();
            } catch (InsufficentBalanceException e) {
                e.printStackTrace();
            }
        }
        accBalance -= withdrawAmount;
         Transaction t = new Transaction(r.nextInt(),
                 accountNumber, withdrawAmount, "withdraw",accBalance);
         TransactionDetails.addTransaction(t);
         System.out.println("Withdraw Completed");
     }


}
