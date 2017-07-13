package com.mycompany.app;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
 
//import com.java2novice.junit.samples.Employee;
 
public class AnyTest {
     
    Object[] expected = new Object[3];
     
    @Before
    public void initInputs(){
        expected[0] = new Any(1, "Abc", "prethi");
        expected[1] = new Any(2, "Bcd", "ramya");
        expected[2] = new Any(3, "Cde", "priya");
    }
     
    @Test
    public void compareAny(){
        
        Object[] testOutput = Any.getList().toArray();
        assertArrayEquals(expected, testOutput);
    }
}