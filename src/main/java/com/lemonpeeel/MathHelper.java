package com.lemonpeeel;

public class MathHelper {

    public static double[] quadraticFormula (String firstString, String secondString, String thirdString) {

        // Double a is coefficient of x squared.
        double a = Double.parseDouble(firstString);

        // Double b is coefficient of x.
        double b = Double.parseDouble(secondString);

        // Double c is constant.
        double c = Double.parseDouble(thirdString);

        double determinant = Math.pow(b, 2) - 4 * a * c;

        if (determinant == 0) {
            return new double[] {(-1*b) / (2*a)};
        }
        else {
            double firstRoot = (-1*b + Math.sqrt(determinant)) / (2*a);
            double secondRoot = (-1*b - Math.sqrt(determinant)) / (2*a);

            return new double[]{firstRoot, secondRoot};

        }
    }


    public static double PythagoreanTheorem (String firstString, String secondString, String thirdString) {

        // Double a is height of Triangle.
        double a = Double.parseDouble(firstString);

        // Double b is base of Triangle.
        double b = Double.parseDouble(secondString);

        // Double c is hypotenuseOfTriangle.
        double c = Double.parseDouble(thirdString);

        if (Math.abs(a) + Math.abs(b) <= Math.abs(c)) {

            System.out.println("It's not a triangle.");
            return a + b - c;

        }
        double resultsOfPythagoreanOperation =
                Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2);

        if (resultsOfPythagoreanOperation < 0) {
            System.out.println("This triangle is an acute triangle.");

            return resultsOfPythagoreanOperation;
        }
        else if (resultsOfPythagoreanOperation == 0) {
            System.out.println("This triangle is a right triangle.");

            return resultsOfPythagoreanOperation;
        }
        else {
            System.out.println("This triangle is an obtuse triangle.");

            return resultsOfPythagoreanOperation;
        }




    }




}
