package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CopyArrTopDown {

    private SizeStabCopyArrWhenValidInput SizeStabCopyArrWhenValidInput = new SizeStabCopyArrWhenValidInput();
    private SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty = new SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty();
    private SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck = new SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck();

    /**
     * This function will check the copyArr function when the input is valid
     */
    @Test
    public void copyArrWhenValidInput()
    {
        boolean pass = true;
        int [] array = {0,1,2,3,4};
        int size=5;
        try
        {
            int [] arr = SizeStabCopyArrWhenValidInput.copyArr(array);
            assertTrue(arr != array);
            assertEquals(array.length,arr.length);
            for(int i=0;i<size;i++)
            {
                assertEquals(array[i],arr[i]);
            }
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the copyArr function when the input is null
     */
    @Test
    public void copyArrWhenNull()
    {
        boolean pass = true;
        try
        {
            int [] arr = SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck.copyArr(null);
            assertTrue(arr ==null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }
    /**
     * This function will check the copyArr function when the input is empty
     */
    @Test
    public void copyArrWhenEmpty()
    {
        boolean pass = true;
        int [] array = {};
        try
        {
            int [] arr = SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty.copyArr(array);
            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

}
