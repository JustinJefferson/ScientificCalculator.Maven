package com.zipcodewilmington.scientific_calculator;

import static org.junit.Assert.*;

import com.zipcodewilmington.scientificcalculator.BasicCalc;
import com.zipcodewilmington.scientificcalculator.ExtendedCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    /*

    Example Test

    @Test
    public void TestIfs()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.playerDied(true);
        assertEquals("Game Over!", writeIFs1.ss);
    }

     */

    @Test
    public void SumTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.sumCalc(4.0, 5.5);
        double expected = 9.5;
        assertEquals(expected, check, 0.000001);

    }

    @Test
    public void DiffTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.diffCalc(5.0, 3.5);
        double expected = 1.5;
        assertEquals(expected, check, 0.00001);

    }

    @Test
    public void ProductTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.productCalc(1.5, 6.0);
        double expected = 9.0;
        assertEquals(expected, check,0.00001);

    }

    @Test
    public void QuotientTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.quotientCalc(9.0, 3.0);
        double expected = 3.0;
        assertEquals(expected, check, 0.00001);

    }

    @Test
    public void SquareTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.squareCalc(4.0);
        double expected = 16.0;
        assertEquals(expected, check, 0.0);

    }

    @Test
    public void ExponentTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.exponentCalc(2.0, 3.0);
        double expected = 8.0;
        assertEquals(expected, check, 0.0);

    }

    @Test
    public void InverseTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.inverseCalc(100.0);
        double expected = -100.0;
        assertEquals(expected, check, 0.0);

    }

    @Test
    public void InvertTest(){

        BasicCalc basicCalc = new BasicCalc();
        double check = basicCalc.invertCalc(5.0);
        double expected = 0.2;
        assertEquals(expected, check, 0.0);

    }

    @Test
    public void SinTest(){

    }

    @Test
    public void CosTest(){

    }

    @Test
    public void TanTest(){

    }

    @Test
    public void ArcSinTest(){

    }

    @Test
    public void ArcCosTest(){

    }

    @Test
    public void ArcTanTest(){

    }

    @Test
    public void LogTest(){

        Double check = ExtendedCalculator.calcLog10(100.0);
        Double expected = 2.0;
        assertEquals(expected, check);

    }

    @Test
    public void InvLogTest(){

    }

    @Test
    public void LnTest(){

    }

    @Test
    public void InvLnTest(){

    }

    @Test
    public void SqrtTest(){

        Double num = 16.0;
        Double check = ExtendedCalculator.calcSqrt(num);
        Double expected = 4.0;
        assertEquals(expected, check);

    }

    @Test
    public void FactTest(){

        Integer check = ExtendedCalculator.calcFactorial(4);
        Integer expected = 24;
        assertEquals(expected, check);

    }

    @Test
    public void MemoryTest(){

    }

    @Test
    public void ClearTest(){

    }


}
