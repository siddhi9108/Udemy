package javaapplication1;

import java.util.Scanner;

public class NewClass_Udemy_1 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your day: ");
        int x = ob.nextInt();
        String s = "";
        switch (x) {
            case 1:
                s = "Monday";
                break;
            case 2:
                s = "Tuesday";
                break;
            case 3:
                s = "Wednesday";
                break;
            case 4:
                s = "Thursday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s = "Saturday";
                break;
            case 7:
                s = "Sunday";
                break;
        }
        System.out.println("Your day is: " + s);
    }

}
