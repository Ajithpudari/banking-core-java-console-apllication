package com.ajtechie.banking;

public class InsufficentBalanceException extends Throwable {
    public String toString(){
        return "balance not sufficient";
    }
}
