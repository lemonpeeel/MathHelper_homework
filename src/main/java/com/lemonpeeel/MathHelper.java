package com.lemonpeeel;

public class MathHelper {

    public static double[] quadraticFormula (String firstString, String secondString, String thirdString) {

        double coefficientOfXSquared = Double.parseDouble(firstString);
        double coefficientOfX = Double.parseDouble(secondString);
        double constant = Double.parseDouble(thirdString);

        double determinant = Math.pow(coefficientOfX, 2) - 4 * coefficientOfXSquared * constant;

        if (determinant == 0) {
            return new double[] {(-1*coefficientOfX) / (2*coefficientOfXSquared)};
        }
        else {
            double firstRoot = (-1*coefficientOfX + Math.sqrt(determinant)) / (2*coefficientOfXSquared);
            double secondRoot = (-1*coefficientOfX - Math.sqrt(determinant)) / (2*coefficientOfXSquared);

            return new double[]{firstRoot, secondRoot};

        }
    }


    public static double PythagoreanTheorem (String firstString, String secondString, String thirdString) {

        double heightOfTriangle = Double.parseDouble(firstString);
        double baseOfTriangle = Double.parseDouble(secondString);
        double hypotenuseOfTriangle = Double.parseDouble(thirdString);

        if (Math.abs(heightOfTriangle) + Math.abs(baseOfTriangle) > Math.abs(hypotenuseOfTriangle)) {
            double resultsOfPythagoreanOperation =
                    Math.pow(hypotenuseOfTriangle, 2) - Math.pow(heightOfTriangle, 2) - Math.pow(baseOfTriangle, 2);

            if (resultsOfPythagoreanOperation < 0) {
                System.out.println("The result is " + resultsOfPythagoreanOperation +".");
                System.out.println("This triangle is an acute triangle.");

                return resultsOfPythagoreanOperation;
            }
            else if (resultsOfPythagoreanOperation == 0) {
                System.out.println("The result is " + resultsOfPythagoreanOperation +".");
                System.out.println("This triangle is a right triangle.");

                return resultsOfPythagoreanOperation;
            }
            else {
                System.out.println("The result is " + resultsOfPythagoreanOperation +".");
                System.out.println("This triangle is an obtuse triangle.");

                return resultsOfPythagoreanOperation;
            }

        }
        else {
            System.out.println("It's not a triangle.");
            return hypotenuseOfTriangle;
        }
    }




}
