package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class minValueTopDown {

    private maxValueIndex_stab1 maxValueIndex_stab1= new maxValueIndex_stab1();
    private maxValueIndex_stab2 maxValueIndex_stab2= new maxValueIndex_stab2();

    /**
     * This function will check the minValue function when the input is null
     */
    @Test
    public void minValueWhenNull()
    {
        boolean pass = true;
        try
        {
            maxValueIndex_stab1.minValue(null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the minValue function when the input is valid
     */
    @Test
    public void minValueValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = maxValueIndex_stab2.minValue(arr);
        assertEquals(1,value);
    }

    /**
     * This function will check the minValue function when the input is an empty array
     */
    @Test
    public void minValueValidInputEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = maxValueIndex_stab1.minValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
