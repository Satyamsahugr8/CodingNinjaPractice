package com.java.ArrayQuestions;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Binary equivalent: " + decimalToBinary(decimal));
        scanner.close();
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert remainder at the beginning of the string
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}
