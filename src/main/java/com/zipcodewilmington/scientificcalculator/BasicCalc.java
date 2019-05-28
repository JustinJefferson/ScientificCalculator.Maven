package com.zipcodewilmington.scientificcalculator;


public class BasicCalc {

    public BasicCalc(){

    }



    public double sumCalc(double a, double b){

        double sum = a + b;
        return sum;

    }
    public double diffCalc(double a, double b){

        double diff = a - b;
        return diff;
    }
    public double productCalc(double a, double b){

        double product = a * b;
        return product;

    }
    public double quotientCalc(double a, double b){

        double quotient = a / b;
        return quotient;

    }
    public double squareCalc(double a){

        double square = a * a;
        return square;

    }
    public double exponentCalc(double a, double b){

        double exponent = Math.pow(a,b);
        return exponent;

    }

    public double invertCalc(double a){

        double invert = 1 / a;
        return invert;

    }

    public double inverseCalc(double a){

        double inverse = a * -1;
        return inverse;

    }
}
