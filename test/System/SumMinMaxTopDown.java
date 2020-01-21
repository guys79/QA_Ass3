package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SumMinMaxTopDown {


    private MinValueMaxValueStabSumMinMaxWhenNullAndSumMinMaxWhenEmpty MinValueMaxValueStabSumMinMaxWhenNullAndSumMinMaxWhenEmpty = new MinValueMaxValueStabSumMinMaxWhenNullAndSumMinMaxWhenEmpty();
    private MinValueMaxValueStabSumMinMaxValidInput MinValueMaxValueStabSumMinMaxValidInput = new MinValueMaxValueStabSumMinMaxValidInput();

    /**
     * This function will check the sumMinMax function when the input is null
     */
    @Test
    public void sumMinMaxWhenNull()
    {
        boolean pass= true;
        try
        {
            int [] arr = null;
            int value = MinValueMaxValueStabSumMinMaxWhenNullAndSumMinMaxWhenEmpty.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the sumMinMax function when the input is empty
     */
    @Test
    public void sumMinMaxWhenEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = MinValueMaxValueStabSumMinMaxWhenNullAndSumMinMaxWhenEmpty.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the sumMinMax function when the input is valid
     */
    @Test
    public void sumMinMaxValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = MinValueMaxValueStabSumMinMaxValidInput.sumMinMax(arr);
        assertEquals(5,value);
    }

}
