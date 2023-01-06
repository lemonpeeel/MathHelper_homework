package com.lemonpeeel;

public class MathHelper {

    public static double[] quadraticFormula (String firstString, String secondString, String thirdString) {

        double a = Double.parseDouble(firstString); //a = coefficient of x squared, 이차항계수
        double b = Double.parseDouble(secondString);//b = coefficient of x, 일차항계수
        double c = Double.parseDouble(thirdString);//c = constant, 상수항

        double determinant = Math.pow(b, 2) - 4 * a * c;//판별식

        if (determinant == 0) {
            return new double[] {(-1*b) / (2*a)};//중근
        }
        else {
            double firstRoot = (-1*b + Math.sqrt(determinant)) / (2*a);//Math.sqrt: 제곱근 연산자
            double secondRoot = (-1*b - Math.sqrt(determinant)) / (2*a);

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
