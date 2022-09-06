package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeirdTest {
    @Test
    public void testPrint_iff_odd_Weird() 
    {
     Weird weird = new Weird();
     String numb = weird.Print(3);
     assertEquals( "Weird", numb);

    }

    @Test
    public void testPrint_iff_even_range_2_5_not_Weird() 
    {
     Weird weird = new Weird();
     String numb = weird.Print(2);
     assertEquals( "not Weird", numb);
    }
}
