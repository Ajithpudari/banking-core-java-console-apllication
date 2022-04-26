package com.ajtechie.banking;

public class Transaction {
    private int transactionNumber;
    private int actNumber;
    private int tranAmount;
    private String tranType;
    private  int balanceAfterTran;

    public Transaction() {

    }

    public Transaction(int transactionNumber, int actNumber, int tranAmount, String tranType, int balanceAfterTran) {
        this.transactionNumber = transactionNumber;
        this.actNumber = actNumber;
        this.tranAmount = tranAmount;
        this.tranType = tranType;
        this.balanceAfterTran = balanceAfterTran;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(int tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public int getBalanceAfterTran() {
        return balanceAfterTran;
    }

    public void setBalanceAfterTran(int balanceAfterTran) {
        this.balanceAfterTran = balanceAfterTran;
    }
}
