package com.company;
import java.util.Scanner;
public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a numbers:");
                int number = input.nextInt();
                if (number/100==number%10) {
                    System.out.println("palindrome:" + number);
                } else {
                    System.out.println("not a palindrome:" + number);
                }
            }
}
