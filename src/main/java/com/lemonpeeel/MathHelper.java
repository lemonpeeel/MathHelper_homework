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

        double a = Double.parseDouble(firstString);//a = height of Triangle, 높이
        double b = Double.parseDouble(secondString);//b = base of Triangle, 밑변
        double c = Double.parseDouble(thirdString);//c = hypotenuseOfTriangle, 빗변

        if (Math.abs(a) + Math.abs(b) > Math.abs(c)) {
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
        else {
            System.out.println("It's not a triangle.");
            return a + b - c;
        }
    }




}
