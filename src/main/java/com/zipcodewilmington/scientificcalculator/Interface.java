package com.zipcodewilmington.scientificcalculator;


import java.sql.SQLOutput;

import javax.xml.bind.SchemaOutputResolver;

import java.util.Scanner;

public class Interface {
    private double workingNum;
    private String input;
    private double memory;
    private Scanner userIn;
    private String operator;
    private String expression;
    private String function;
    private String inputNum;
    private boolean runInterface;
    private BasicCalc basicCalc;
    private ExtendedCalculator exCalc;
    private boolean isRadians;

    public Interface() {
        workingNum = 0.0;
        input = "";
        memory = 0.0;
        userIn = new Scanner(System.in);
        operator = "";
        expression = "";
        function = "";
        inputNum = "";
        runInterface = true;
        basicCalc = new BasicCalc();
        exCalc = new ExtendedCalculator();
        isRadians = false;
    }

    private void resetInput() {
        input = "";
        operator = "";
        expression = "";
        function = "";
        inputNum = "";
    }

    public void startInterface() {

        Double changeToDouble = 0.0;

        System.out.println("#################################\n");
        System.out.println("Welcome to the Group 2 Calculator\n");
        System.out.println("#################################\n");

        while (runInterface) {

            parseInput();

            if (!function.isEmpty()) {
                //Do function and Nothing else
                performFunction();

            } else {
                // Perform math
                if ((!expression.isEmpty()) && (!inputNum.isEmpty())) {
                    //perform math and change input Num

                    performExpression();
                }
                if ((!inputNum.isEmpty()) && (!operator.isEmpty())) {
                    //perform operation on working number

                    performOperator();
                    //System.out.println("Perfoming operator");

                    // changeToDouble = new Double(inputNum);
                    //workingNum = changeToDouble;
                } else if (!inputNum.isEmpty()) {
                    //replace working number with input number

                    changeToDouble = new Double(inputNum);
                    workingNum = changeToDouble;
                } else {
                    // return statement requesting input
                    System.out.println("Please input an operation");
                    System.out.println();
                }
            }
//            System.out.println(operator);
//            System.out.println(expression);
//            System.out.println(inputNum);
//            System.out.println(function);
//            System.out.println(input);
//            System.out.println();

            if(runInterface) {
                System.out.println(workingNum);
                System.out.println();
            }

            //Testing parse
//            System.out.println(function);
//            System.out.println(operator);
//            System.out.println(expression);
//            System.out.println(inputNum);
//            System.out.println(input);

            resetInput();

        }


        System.out.println("Calculator Shutting down...");



    }

    // Get formula from the user
    public String getUserIn() {

        String userInput = userIn.nextLine();
        return userInput;
    }

    private void parseInput() {


        //get the user input
        input = userIn.nextLine();

        input += "fill";

        input = input.trim();
        input = input.toLowerCase();

        System.out.println();

        int i = 0;
        String match = "";
        String check = "";

        // Read the characters 1 by 1 until correct text is found
        // Save operator, Expression, and/or Function
        while (i < input.length()) {
            check = input.substring(0, i);


            switch (check) {
                case "+":
                    operator = "+";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "-":
                    operator = "-";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "*":
                    operator = "*";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "/":
                    operator = "/";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "square":
                    function = "square";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;
                case "^":
                    operator = "^";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "invert":
                    function = "invert";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;

                case "inverse":
                    function = "inverse";
                    input = input.substring(7);
                    input = input.trim();
                    i = -1;
                    break;

                case "sqrt":
                    expression = "sqrt";
                    input = input.substring(4);
                    input = input.trim();
                    i = -1;
                    break;

                case "sin":
                    expression = "sin";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;
                    break;

                case "cos":
                    expression = "cos";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;
                    break;

                case "tan":
                    expression = "tan";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;
                    break;

                case "arcsin":
                    expression = "arcsin";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;

                case "arccos":
                    expression = "arccos";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;

                case "arctan":
                    expression = "arctan";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;

                case "log":
                    expression = "log";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;
                    break;

                case "10^":
                    expression = "10^";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;

                case "ln":
                    expression = "ln";
                    input = input.substring(2);
                    input = input.trim();
                    i = -1;
                    break;

                case "e^":
                    expression = "e";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "!":
                    expression = "!";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "c":
                    function = "c";
                    input = input.substring(1);
                    input = input.trim();
                    i = -1;
                    break;

                case "m+":
                    function = "m+";
                    input = input.substring(2);
                    input = input.trim();
                    i = -1;
                    break;

                case "mc":
                    function = "mc";
                    input = input.substring(2);
                    input = input.trim();
                    i = -1;
                    break;

                case "mrc":
                    function = "mrc";
                    input = input.substring(3);
                    input = input.trim();
                    i = -1;
                    break;

                case "display":
                    function = "display";
                    input = input.substring(7);
                    input = input.trim();
                    i = -1;
                    break;

                case "trig unit":
                    function = "trig unit";
                    input = input.substring(9);
                    input = input.trim();
                    i = -1;
                    break;

                case "history":
                    function = "history";
                    input = input.substring(7);
                    input = input.trim();
                    i = -1;
                    break;

                case "recall":
                    function = "recall";
                    input = input.substring(6);
                    input = input.trim();
                    i = -1;
                    break;

                case "quit":
                    function = "quit";
                    input = input.substring(4);
                    input = input.trim();
                    i = -1;
                    break;

                default:
                    break;
            }

            i++;

        }

        // Find the number left in input
        char[] findNum = input.toCharArray();
        boolean notADigit = false;
        String foundNum = "";

        for (char digit : findNum) {

            switch (digit) {
                case '0':
                    foundNum += "0";
                    break;

                case '1':
                    foundNum += "1";
                    break;

                case '2':
                    foundNum += "2";
                    break;

                case '3':
                    foundNum += "3";
                    break;

                case '4':
                    foundNum += "4";
                    break;

                case '5':
                    foundNum += "5";
                    break;

                case '6':
                    foundNum += "6";
                    break;

                case '7':
                    foundNum += "7";
                    break;

                case '8':
                    foundNum += "8";
                    break;

                case '9':
                    foundNum += "9";
                    break;

                case '.':
                    foundNum += ".";
                    break;

                default:
                    notADigit = true;
                    break;

            }

            if (notADigit) break;

        }

        inputNum = foundNum;
    }

    private void performExpression() {

        /* These are all of the extended functions

        calcSin
        calcCos
        calcTan
        calcArcSin
        calcArcCos
        calcArcTan
        calcSqrt
        calcLog
        calcLog10
        calcFactorial
        calcExp
        calcExp10
         */

        Double numIn = new Double(inputNum);
        Double result = 0.0;

        switch(expression){
            case "sin":
                result = ExtendedCalculator.calcSin(numIn, isRadians);
                break;

            case "cos":
                result = ExtendedCalculator.calcCos(numIn, isRadians);
                break;

            case "tan":
                result = ExtendedCalculator.calcTan(numIn, isRadians);
                break;

            case "arcsin":
                result = ExtendedCalculator.calcArcSin(numIn, isRadians);
                break;

            case "arccos":
                result = ExtendedCalculator.calcArcCos(numIn, isRadians);
                break;

            case "arctan":
                result = ExtendedCalculator.calcArcTan(numIn, isRadians);
                break;

            case "sqrt":
                result = ExtendedCalculator.calcSqrt(numIn);
                break;

            case "log":
                result = ExtendedCalculator.calcLog(numIn);
                break;

            case "ln": // log10
                result = ExtendedCalculator.calcLog10(numIn);
                break;

            case "!":  // Factorial
                Integer intResult = ExtendedCalculator.calcFactorial(numIn.intValue());
                result = intResult.doubleValue();
                break;

            case "e^": // exp
                result = ExtendedCalculator.calcExp(numIn);
                break;

            case "10^":// exp10
                result = ExtendedCalculator.calcExp10(numIn);
                break;

            default:
                System.out.println("Err: Expression not found\n");
                break;

        }
        inputNum = result.toString();
    }

    private void performOperator(){

        Double numIn = new Double(inputNum);
        double placeholder = 0;

        switch(operator) {
            case "+":
                placeholder = basicCalc.sumCalc(workingNum, numIn);
                break;

            case "-":
                placeholder = basicCalc.diffCalc(workingNum, numIn);
                break;

            case "*":
                placeholder = basicCalc.productCalc(workingNum, numIn);
                break;

            case "/":
                if (numIn == 0) {
                    System.out.println("Err: Undefined\n");
                    placeholder = 0.0;
                } else {
                    placeholder = basicCalc.quotientCalc(workingNum, numIn);
                }
                break;

            case "^":
                placeholder = basicCalc.exponentCalc(workingNum, numIn);
                break;

            default:
                System.out.println("Err: Operator not found\n");
                break;
        }
        //System.out.println(placeholder);

        workingNum = placeholder;


    }

    private void performFunction(){


        switch(function){
            case "c":
                workingNum = 0.0;
                break;

            case "m+":
                memory += workingNum;
                break;

            case "mc":
                memory = 0.0;
                break;

            case "mrc":
                System.out.println("Memory: " + memory + "\n");
                break;

            case "display":
                break;

            case "trig unit":

                if (isRadians) {
                    isRadians = false;
                    System.out.println("Trig Unit: Degrees\n");
                }
                else {
                    isRadians = true;
                    System.out.println("Trig Uint: Radians\n");
                }
                break;

            case "history":
                break;

            case "recall":
                break;

            case "quit":
                runInterface = false;
                break;


            // These functions were moved from operators to improve program function
            case "square":
                workingNum = basicCalc.squareCalc(workingNum);
                break;

            case "invert":
                if (workingNum == 0) {
                    System.out.println("Err: Undefined\n");
                    workingNum = 0.0;
                } else {
                    workingNum = basicCalc.invertCalc(workingNum);
                }
                break;

            case "inverse":
                workingNum = basicCalc.inverseCalc(workingNum);
                break;

            default:
                System.out.println("Err: Function not found\n");
                break;
        }

    }




}
