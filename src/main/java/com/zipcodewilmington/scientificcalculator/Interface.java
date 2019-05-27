package com.zipcodewilmington.scientificcalculator;

import java.sql.SQLOutput;
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
                    //performOperation

                    changeToDouble = new Double(inputNum);
                    workingNum = changeToDouble;
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

            System.out.println(workingNum);
            System.out.println();

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
        input += " fill";
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
                    operator = "square";
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

                case "inv":
                    operator = "inv";
                    input = input.substring(3);
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

                case "ln":
                    expression = "ln";
                    input = input.substring(2);
                    input = input.trim();
                    i = -1;
                    break;

                case "e":
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

        switch(expression){
            case "sqrt":
                // inputNum = <objectName>.calcSqrt(inputNum);
                break;

            case "sin":
                // inputNum = <objectName>.calcSin(inputNum);
                break;

            case "cos":
                // inputNum = <objectName>.calcCos(inputNum);
                break;

            case "tan":
                // inputNum = <objectName>.calcTan(inputNum);
                break;

            case "arcsin":
                // inputNum = <objectName>.calcArcSin(inputNum);
                break;

            case "arccos":
                // inputNum = <objectName>.calcArcCos(inputNum);
                break;

            case "arctan":
                // inputNum = <objectName>.calcArcTan(inputNum);
                break;

            case "log":
                // inputNum = <objectName>.calcLog(inputNum);
                break;

            case "ln":
                // inputNum = <objectName>.calcExp(inputNum);
                break;

            case "e":
                // inputNum = <objectName>.calcExp10(inputNum);
                break;

            case "!":
                // inputNum = <objectName>.calcFactorial(inputNum);
                break;

            default:
                System.out.println("Err: No Expression Found\n");
                break;
        }
    }

    private void performFunction(){

        switch(function) {
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
                break;

            case "history":
                break;

            case "recall":
                break;

            case "quit":
                runInterface = false;
                break;

        }

    }




}
