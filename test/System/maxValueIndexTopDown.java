package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class maxValueIndexTopDown {

    private SizeStabMaxValueIndexValidCheck SizeStabMaxValueIndexValidCheck = new SizeStabMaxValueIndexValidCheck();
    private SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty = new SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty();
    private SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck = new SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck();
    private SizeStabMaxValueIndexValidSingleCheck SizeStabMaxValueIndexValidSingleCheck = new SizeStabMaxValueIndexValidSingleCheck();


    /**
     * This function will check the maxIndexValue function when the input is null
     */
    @Test
    public void  maxValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            SizeStabCopyArrWhenNullAndMaxValueIndexNullCheck.maxValueIndex(null);
        }
        catch(Exception e)
        {
            pass = false;

        }
        assertTrue(pass);
    }

    /**
     * This function will check the maxValueIndex function when the input is valid
     */
    @Test
    public void  maxValueIndexValidCheck()
    {
        int [] arr = {3,4,2,1};
        int index;
        index = SizeStabMaxValueIndexValidCheck.maxValueIndex(arr);
        assertEquals(1,index);
    }

    /**
     * This function will check the maxValueIndex function when the input is an empty array
     */
    @Test
    public void  maxValueIndexValidEmptyCheck()
    {
        int [] arr = {};
        int index;
        index = SizeStabMaxValueIndexValidEmptyCheckAndCopyArrWhenEnpty.maxValueIndex(arr);
        assertEquals(-1,index);
    }
    /**
     * This function will check the maxValueIndex function when the input is an array with the size of 1
     */
    @Test
    public void  maxValueIndexValidSingleCheck()
    {
        int [] arr = {7};
        int index;
        index = SizeStabMaxValueIndexValidSingleCheck.maxValueIndex(arr);
        assertEquals(0,index);
    }

}
