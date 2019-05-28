package com.zipcodewilmington.scientificcalculator;

public class ExtendedCalculator {
 /*   public static void main(String[] args) {
        Boolean isRadians;
        Double myTest;
        Double myTest2;
        Integer intTest;
        Double myResult;
        Integer intResult;
        String units;

    System.out.println("");
    for (myTest = -570.0; myTest <= 570.0; myTest = myTest + 5.0) {
        myResult = calcArcTan(myTest, false);
        System.out.println("ArcTan(" + myTest + ") = " + myResult);
    }
    for (myTest = 0.0; myTest < 360.0; myTest = myTest + 1.0) {
        isRadians = false;
        units = " degrees";
        myResult = calcSin(myTest, isRadians);
        System.out.println("Sin(" + myTest + units + ") = " + prtRnd(myResult));
        myResult = calcCos(myTest, isRadians);
        System.out.println("Cos(" + myTest + units + ") = " + myResult);
        myResult = calcTan(myTest, isRadians);
        System.out.println("Tan(" + myTest + units + ") = " + myResult);
        myResult = calcArcSin(myTest, isRadians);
        System.out.println("ArcSin(" + myTest + units + ") = " + myResult);
        myResult = calcArcCos(myTest, isRadians);
        System.out.println("ArcCos(" + myTest + units + ") = " + myResult);
        myResult = calcArcTan(myTest, isRadians);
        System.out.println("ArcTan(" + myTest + units + ") = " + myResult);
    }
*/
/*
    for (myTest = 0.0; myTest < 2 * Math.PI ; myTest = myTest + 2 * Math.PI /24) {
        isRadians = true;
        units = " radians";
        myResult = calcSin(myTest, isRadians);
        System.out.println("Sin(" + myTest + units + ") = " + myResult);
        myResult = calcCos(myTest, isRadians);
        System.out.println("Cos(" + myTest + units + ") = " + myResult);
        myResult = calcTan(myTest, isRadians);
        System.out.println("Tan(" + myTest + units + ") = " + myResult);
        myResult = calcArcSin(myTest, isRadians);
        System.out.println("ArcSin(" + myTest + units + ") = " + myResult);
        myResult = calcArcCos(myTest, isRadians);
        System.out.println("ArcCos(" + myTest + units + ") = " + myResult);
        myResult = calcArcTan(myTest, isRadians);
        System.out.println("ArcTan(" + myTest + units + ") = " + myResult);
    }
*/
/*
    myTest = 169.0;
    myResult = calcSqrt(myTest);
    System.out.println("SQRT(" + myTest + ") = " + myResult);
    myTest = Math.exp(6.0);
    myResult = calcLog(myTest);
    System.out.println("LOG(" + myTest + ") = " + myResult);
    myTest = 1000000.0;
    myResult = calcLog10(myTest);
    System.out.println("LOG10(" + myTest + ") = " + myResult);
    intTest = 10;
    intResult = calcFactorial(intTest);
    System.out.println("Factorial(" + intTest + ") = " + intResult);
    myTest = 10.0;
    myResult = calcExp(myTest);
    System.out.println("Exp(" + myTest + ") = " + myResult);
    myTest = 10.0;
    myResult = calcExp10(myTest);
    System.out.println("Exp10(" + myTest + ") = " + myResult);
*/

    // Round for printing Doubles.
    // keep the original variable value as incoming.
    // Not needed for Integer types.
    public static Double prtRnd(Double incoming) {
        Double result = 0.0;
        Double bigRound = 1.0E15;
        result = Math.round(bigRound * incoming) / bigRound;
        return result;
    }
    // Sin calculation
    public static Double calcSin(Double incoming, Boolean isRadians) {
        Double result =  0.0;
        if (isRadians) {
            result = Math.sin(incoming);
        }
        else {
            result = Math.sin(Math.toRadians(incoming));
        }
        return result;
    }
    // Cos calculation
    public static Double calcCos(Double incoming, Boolean isRadians) {
        Double result =  0.0;
        if (isRadians) {
            result = Math.cos(incoming);
        }
        else {
            result = Math.cos(Math.toRadians(incoming));
        }
        return result;
    }
    // Tan calculation
    public static Double calcTan(Double incoming, Boolean isRadians) {
        Double result =  0.0;
        if (isRadians) {
            if (incoming % 2*Math.PI == 2*Math.PI/4.0) {
                return null;
            } else if (incoming % 2*Math.PI == 3*2*Math.PI/4.0) {
                return null;
            }
        }
        else {
            if (incoming % 360 == 90.0) {
                return null;
            } else if (incoming % 360 == 270.0) {
                return null;
            }
        }
        if (isRadians) {
            result = Math.tan(incoming);
        }
        else {
            result = Math.tan(Math.toRadians(incoming));
        }
        return result;
    }
    // ArcSin calculation
    public static Double calcArcSin(Double incoming, Boolean isRadians) {
        Double result = 0.0;
        if (incoming < -1.0) {
            return null;
        } else if (incoming > 1.0) {
            return null;
        }
        result = Math.asin(incoming);
        if (!isRadians) result = 360 * result / (2*Math.PI);
        return result;
    }
    // ArcCos calculation
    public static Double calcArcCos(Double incoming, Boolean isRadians) {
        Double result = 0.0;
        if (incoming < -1.0) {
            return null;
        } else if (incoming > 1.0) {
            return null;
        }
        result = Math.acos(incoming);
        if (!isRadians) result = 360 * result / (2*Math.PI);
        return result;
    }
    // ArcTan calculation
    public static Double calcArcTan(Double incoming, Boolean isRadians) {
        Double result =  0.0;
        if (incoming < -570.0) {
            return null;
        } else if (incoming > 570.0) {
            return null;
        }
        result = Math.atan(incoming);
        if (!isRadians) result = 360 * result / (2*Math.PI);
        return result;
    }
    // Sqrt calculation
    public static Double calcSqrt(Double incoming) {
        Double result =  0.0;
        if (incoming < 0.0) return null;
        result = Math.sqrt(incoming);
        return result;
    }
    // Log calculation
    public static Double calcLog(Double incoming) {
        Double result =  0.0;
        if (incoming <= 0.0) return null;
        result = Math.log(incoming);
        return result;
    }
    // Log10 calculation
    public static Double calcLog10(Double incoming) {
        Double result =  0.0;
        if (incoming <= 0.0) return null;
        result = Math.log10(incoming);
        return result;
    }
    // Factorial calculation
    public static Integer calcFactorial(Integer incoming) {
        Integer result = 1;
        if (incoming <= 0) return null;
        for (Integer i = 1; i <= incoming; i++) {
            result = result * i;
        }
        return result;
    }
    // e^incoming calculation
    public static Double calcExp(Double incoming) {
        Double result =  0.0;
        result = Math.exp(incoming);
        return result;
    }
    // 10^incoming calculation
    public static Double calcExp10(Double incoming) {
        Double base = 10.0;
        Double result =  0.0;
        result = Math.pow(base, incoming);
        return result;
    }
}