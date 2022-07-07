package com.bobbyworld;

import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date(); // Date is a reference type
        // new Date() - allows allocated memory  to value
        System.out.println(now);
    }
}
