package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class swapMinMax {
    private minValueIndex_copyArr_maxValue_stab1 minValueIndex_copyArr_maxValue_stab1= new minValueIndex_copyArr_maxValue_stab1();
    private minValueIndex_copyArr_maxValue_stab2 minValueIndex_copyArr_maxValue_stab2= new minValueIndex_copyArr_maxValue_stab2();
    private minValueIndex_copyArr_maxValue_stab3 minValueIndex_copyArr_maxValue_stab3= new minValueIndex_copyArr_maxValue_stab3();
    private minValueIndex_copyArr_maxValue_stab4 minValueIndex_copyArr_maxValue_stab4= new minValueIndex_copyArr_maxValue_stab4();
    /**
     * This function will check the swapMinMax function when the input is valid
     */
    @Test
    public void swapMinMaxWhenValid()
    {
        boolean pass = true;
        int [] array = {6,5,4,3,2,1};
        int [] array2 = {1,5,4,3,2,6};
        try
        {
            int [] arr = minValueIndex_copyArr_maxValue_stab1.swapMinMax(array);
            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

            assertEquals(arr[0],array[5]);
            assertEquals(array[0],arr[5]);

            for(int i=2;i<arr.length-1;i++)
            {
                assertEquals(array[i],arr[i]);
            }

            arr = minValueIndex_copyArr_maxValue_stab2.swapMinMax(array2);
            assertTrue(arr !=null);
            assertEquals(array2.length,arr.length);

            assertEquals(arr[0],array2[5]);
            assertEquals(array2[0],arr[5]);

            for(int i=2;i<arr.length-1;i++)
            {
                assertEquals(array2[i],arr[i]);
            }

        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the swapMinMax function when the input is null
     */
    @Test
    public void swapMinMaxWhenNull()
    {
        //System.out.println(minValueIndex_copyArr_maxValue_stab4.maxValue(null));
        //System.out.println(minValueIndex_copyArr_maxValue_stab4.minValueIndex(null));
       // System.out.println(minValueIndex_copyArr_maxValue_stab4.copyArr(null));
        boolean pass = true;
        try
        {
            int [] arr = minValueIndex_copyArr_maxValue_stab3.swapMinMax(null);
            assertTrue(arr ==null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the swapMinMax function when the input is empty
     */
    @Test
    public void swapMinMaxWhenEmpty()
    {

        boolean pass = true;
        int [] array = {};
        try
        {
            int [] arr = minValueIndex_copyArr_maxValue_stab4.swapMinMax(array);
            assertTrue(arr ==null);


        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }


}
