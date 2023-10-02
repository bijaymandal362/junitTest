package com.edu.cs.test.test;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTests {


    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception
    {
        this.arrayFlattener=new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception
    {
        this.arrayFlattener=null;
    }

    @Test
    public void testFlattenArray() {
        //fail("Not yet implemented");
        int[][] nums={{1},{2,3},{4,5}};
        Object[] actual=arrayFlattener.flattenArray(nums);
        Object[] expected= {1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testFlattenArrayNull() {
        //fail("Not yet implemented");
        int[][] nums=null;
        Object[] actual=arrayFlattener.flattenArray(nums);
        assertNull(actual);
    }
}
