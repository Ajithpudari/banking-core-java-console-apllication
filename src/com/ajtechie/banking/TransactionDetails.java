package com.ajtechie.banking;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
    public static List<Transaction> transactionList = new LinkedList<>();
    public static void addTransaction(Transaction t){
        transactionList.add(t);
    }

    public static void showMiniStatement(int actNumber){
        System.out.println("Mini Statwmwnt for AccountNumber " +actNumber);
        for(Transaction t : transactionList){
            if(t.getActNumber()==actNumber){
                System.out.println(t.getTransactionNumber()+ "-" +t.getTranType()+ "-" + t.getTranAmount()+ "-"+ t.getBalanceAfterTran());
            }
        }

    }
}
