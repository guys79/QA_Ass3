package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class sumMinMaxTopDown {


    private minValue_maxValue_stab1 minValue_maxValue_stab1= new minValue_maxValue_stab1();
    private minValue_maxValue_stab2 minValue_maxValue_stab2= new minValue_maxValue_stab2();

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
            int value = minValue_maxValue_stab1.sumMinMax(arr);
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
            int value = minValue_maxValue_stab1.sumMinMax(arr);
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
        int value = minValue_maxValue_stab2.sumMinMax(arr);
        assertEquals(5,value);
    }

}
