package javaapplication1;

import java.util.Scanner;

public class NewClass_Udemy_2 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = ob.nextInt();
        String s = "";
        switch (x) {
            case 1:
                s = "Jan";
                break;
            case 2:
                s = "Feb";
                break;
            case 3:
                s = "March";
                break;
            case 4:
                s = "April";
                break;
            case 5:
                s = "May";
                break;
            case 6:
                s = "June";
                break;
            case 7:
                s = "July";
                break;
            case 8:
                s = "aug";
                break;
            case 9:
                s = "Sept";
                break;
            case 10:
                s = "Oct";
                break;
            case 11:
                s = "Nov";
                break;
            case 12:
                s = "Dec";
                break;
        }
        System.out.println("Your Month is: " + s);
    }

}
