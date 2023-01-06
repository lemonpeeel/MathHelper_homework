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
        double result =
                Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2);

        if (result < 0) {
            System.out.println("This triangle is an acute triangle.");

            return result;
        }
        else if (result == 0) {
            System.out.println("This triangle is a right triangle.");

            return result;
        }
        else {
            System.out.println("This triangle is an obtuse triangle.");

            return result;
        }

    }


    public static double slopeFormulaOfLine (String firstString, String secondString, String thirdString, String forthString) {

        double x1 = Double.parseDouble(firstString);
        double y1 = Double.parseDouble(secondString);
        double x2 = Double.parseDouble(thirdString);
        double y2 = Double.parseDouble(forthString);

        if (x1 == x2) {
            System.out.println("You cannot put 0 in the denominator.");
            return x1 - x2;
        }

        double increasedX = x2 - x1;
        double increasedY = y2 - y1;

        return increasedY/increasedX;
    }




}
