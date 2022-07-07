package com.bobbyworld;

public class EscapeSequences {
    public static void main(String[] args) {
        // backlash (\) is used to escape special characters
        String message = "Hello \"Bobby\"";
        System.out.println(message);

        // \n = new line
        String message2 = "Hello Bobby! \nHow are you doing?";
        System.out.println(message2);

        // \t = tab
        String message3 = "Bobby!\tYou okay?";
        System.out.println(message3);
    }
}
