package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class minValueTopDown {

    private MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty = new MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty();
    private MaxValueIndexStabMaxValueValidInputAndMinValueValidInput MaxValueIndexStabMaxValueValidInputAndMinValueValidInput = new MaxValueIndexStabMaxValueValidInputAndMinValueValidInput();

    /**
     * This function will check the minValue function when the input is null
     */
    @Test
    public void minValueWhenNull()
    {
        boolean pass = true;
        try
        {
            MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty.minValue(null);
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
        int value = MaxValueIndexStabMaxValueValidInputAndMinValueValidInput.minValue(arr);
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
            int value = MaxValueIndexStabMaxValueWhenNullAndMaxValueValidInputEmpty.minValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
