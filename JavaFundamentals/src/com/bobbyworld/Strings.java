package com.bobbyworld;


// TODO: Original String never changes because in Java Strings are immutable

public class Strings {
    public static void main(String[] args) {
        // string literal
        System.out.println("Hello World");

        // string variable
        String message = "Hello World!! " + "Great Day!!"; // original string


        // TODO: Different methods used with Strings
        System.out.println(message.endsWith("!!")); // .endsWith() value will be a boolean
        System.out.println("This variable holds " + message.length() + " characters.");
        System.out.println(message.contains("Hello")); // .contains() value will be a boolean
        System.out.println(message.indexOf("W"));
        System.out.println(message.trim()); // removes all extra white spaces
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.replace("!", "$"));
        //ex.  target and replacement are the parameters
        //ex.  "!" and "$" are the arguments

            /* TODO:  Arguments: the actual values that we pass to these methods
               TODO: Parameters: the holes that we define in our methods
            */
    }
}
