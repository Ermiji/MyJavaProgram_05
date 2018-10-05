package com.company;
import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Enter what you wish to see on console: " + userInput);

        userInput = keyboard.nextLine();

        do{
            System.out.println(userInput);
        }
        while (userInput != "");
    }
    }

