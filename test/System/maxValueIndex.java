package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class maxValueIndex {

    private size_stab4 size_stab4= new size_stab4();
    private size_stab2 size_stab2= new size_stab2();
    private size_stab3 size_stab3= new size_stab3();
    private size_stab5 size_stab5= new size_stab5();


    /**
     * This function will check the maxIndexValue function when the input is null
     */
    @Test
    public void  maxValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            size_stab3.maxValueIndex(null);
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
        index = size_stab4.maxValueIndex(arr);
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
        index = size_stab2.maxValueIndex(arr);
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
        index = size_stab5.maxValueIndex(arr);
        assertEquals(0,index);
    }

}
