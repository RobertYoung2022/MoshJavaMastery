package com.bobbyworld;

import java.awt.*;

// Reference types are copied by the references vs. primitive types are copied by their value(s)

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {

        // Primitive
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

        // Reference
        Point point1 = new Point(13333, 122222);
        Point point2 = point1;
        point1.x = 23;
        System.out.println(point2);
        System.out.println(point2.x); // x is an integer
        System.out.println(point1.getY()); // .getY() is a double method
    }
}
