package com.xbluecode.test;

import static org.junit.Assert.*;

import com.xbluecode.junit4tut.math.EasyMath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedSignTest {

    @Parameterized.Parameter(0)
    public int number;

    @Parameterized.Parameter(1)
    public String sign;

    @Parameterized.Parameters
    public static Collection<Object[]> entries() {
        return Arrays.asList(new Object[][] {
                { 2, "Positive" },
                { -6, "Negative" },
                { 0, "Null" },
                { 1290, "Positive" },
                { -5234, "Negative" },
                { 0000, "Null" }
        });
    }

    @Test
    public void randomSignTest(){
        assertEquals("The Number "+number+" is: ", sign, EasyMath.getSign(number));
    }

}