package com.lemonpeeel;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What help do you need from MathHelper?");
        System.out.println("Please choose.\n"
                                   + "1. a root formula\n"
                                   + "2. Pythagorean Theorem\n"
                                   + "3. Formula of slope of straight line\n"
                                   + "4. Multiplication formula\n");
        String choice = scan.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.println("Please enter the coefficients and a constant of the quadratic equation you want to solve in order.");

                System.out.println("Enter the coefficient of x squared.");
                String firstString = scan.nextLine();

                System.out.println("Enter the coefficient of x.");
                String secondString = scan.nextLine();

                System.out.println("Enter the constant.");
                String thirdString = scan.nextLine();

                double[] result = MathHelper.quadraticFormula(firstString, secondString, thirdString);

                System.out.println("The result is " + Arrays.toString(result));


            }

            case "2" -> {
                System.out.println("Please enter the lengths of the three sides of the triangle in order.");

                System.out.println("Enter the height of the triangle.");
                String firstString = scan.nextLine();

                System.out.println("Enter the length of the base of a triangle.");
                String secondString = scan.nextLine();

                System.out.println("Enter the length of the hypotenuse of the triangle.");
                String thirdString = scan.nextLine();

                double result = MathHelper.PythagoreanTheorem(firstString, secondString, thirdString);

                System.out.println(new StringBuilder().append("the result is ").append(result).toString());


            }

            case "3" -> {
                System.out.println("Please enter two points to find the slope.");

                System.out.println("Enter the first x point.");
                String firstX = scan.nextLine();

                System.out.println("Enter the first y point.");
                String firstY = scan.nextLine();

                System.out.println("Enter the second x point.");
                String secondX = scan.nextLine();

                System.out.println("Enter the second y point.");
                String secondY = scan.nextLine();

                double result = MathHelper.slopeFormulaOfLine(firstX, firstY, secondX, secondY);

                System.out.println(new StringBuilder().append("The slope is ").append(result).toString());








            }


        }







    }
}