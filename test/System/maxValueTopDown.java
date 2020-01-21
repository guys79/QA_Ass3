package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class maxValueTopDown {

    private maxValueIndex_stab1 maxValueIndex_stab1= new maxValueIndex_stab1();
    private maxValueIndex_stab2 maxValueIndex_stab2= new maxValueIndex_stab2();

    /**
     * This function will check the maxValue function when the input is null
     */
    @Test
    public void maxValueWhenNull()
    {
        boolean pass = true;
        try
        {
            maxValueIndex_stab1.maxValue(null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the maxValue function when the input is valid
     */
    @Test
    public void maxValueValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = maxValueIndex_stab2.maxValue(arr);
        assertEquals(4,value);
    }

    /**
     * This function will check the maxValue function when the input is an empty array
     */
    @Test
    public void maxValueValidInputEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = maxValueIndex_stab1.maxValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
