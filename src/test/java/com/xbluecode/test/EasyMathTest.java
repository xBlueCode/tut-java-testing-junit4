package com.xbluecode.test;

import com.xbluecode.junit4tut.math.EasyMath;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class EasyMathTest {

    static int pNum1, pNum2, nNum1, nNum2, zero, sum ;

    @BeforeClass
    public static void setUp (){
        pNum1 = 15 ;
        pNum2 = 4 ;
        nNum1 = -5 ;
        nNum2 = -24 ;
        zero = 0 ;
        sum = pNum1 + pNum2 + nNum1 + nNum2 + zero ;
    }

    @Test
    @Ignore
    public void ignoredFailedTest() {
        fail();
    }

    @Test
    public void additionTest(){
        assertEquals(nNum1+"+"+pNum2+ " = ",nNum1+pNum2, EasyMath.add(nNum1, pNum2));
    }

    @Test
    public void substractionTest(){
        assertEquals(pNum1+"-"+pNum2+ " = ",pNum1-pNum2, EasyMath.substract(pNum1, pNum2));
    }

    @Test
    public void signOfZeroShouldBeNull(){
        assertEquals("Sign of Zero is: ", "Null", EasyMath.getSign(zero));
    }
    @Test
    public void signOfPositiveNumShouldBePositive(){
        assertEquals("Sign of "+ pNum1 + " is: ", "Positive", EasyMath.getSign(pNum1));
    }
    @Test
    public void signOfNegativeNumShouldBeNegative(){
        assertEquals("Sign of "+ nNum1 + " is: ", "Negative", EasyMath.getSign(nNum1));
    }

    @Test
    public void sumTest(){
        assertEquals("The Sum of all numbers should be ",
                sum, EasyMath.sum(pNum1,pNum2,nNum1,nNum2,zero));
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivisionByZeroShouldThrowException(){
        EasyMath.divide(pNum1,zero);
    }

    // TODO : Testing EasyMath.max(n1,n2) funtion
}
