package com.company;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double principleAmount;
        float interestRate;
        int period;

        double mortgage;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the principle amount :");
        principleAmount = x.nextDouble();

        System.out.print("Enter the annual interest rate :");
        interestRate = x.nextFloat();

        System.out.print("Enter the mortgage period :");
        period = x.nextInt();

        float monthlyInterestRate;

        monthlyInterestRate = (float) ((interestRate / 100.0) / 12);
        mortgage = principleAmount * (monthlyInterestRate* Math.pow((1+monthlyInterestRate), (period * 12)) / (Math.pow((1 + monthlyInterestRate), (period * 12)) - 1) );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage :" + mortgageFormatted);
    }
}
