package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class maxValueTopDown {

    private MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty = new MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty();
    private MaxValueIndexStabMaxValueValidInputAndMinValueValidInput MaxValueIndexStabMaxValueValidInputAndMinValueValidInput = new MaxValueIndexStabMaxValueValidInputAndMinValueValidInput();

    /**
     * This function will check the maxValue function when the input is null
     */
    @Test
    public void maxValueWhenNull()
    {
        boolean pass = true;
        try
        {
            MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty.maxValue(null);
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
        int value = MaxValueIndexStabMaxValueValidInputAndMinValueValidInput.maxValue(arr);
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
            int value = MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty.maxValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
