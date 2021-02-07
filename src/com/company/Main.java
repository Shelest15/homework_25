package com.company;

import java.util.Scanner;

public class Main {

    private static int number;

    public static void main(String[] args) throws Exception{
        Scan();
        try
        {
            if (number >= 66)
                throw new Exception("Input " + number + " is between 66 and infinity");

            if (number >= 18 && number <= 65)
                throw new Exception("Input " + number + " is between 18 and 65");

            if (number >= 0 && number <= 17)
                throw new Exception("Input " + number + " is between 0 and 17");

            if (number <0)
                throw new Exception("It seems like You've entered negative number.");
        }
        catch (Exception e0){
            System.out.println(e0.getMessage());
        }
    }
    public static boolean Scan() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        while (true)
            try {
                number = Integer.parseInt(kb.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        return true;

    }

}