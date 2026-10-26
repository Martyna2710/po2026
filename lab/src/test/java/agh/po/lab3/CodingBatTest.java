package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cosik=new CodingBat();
    CodingBat cosik2=new CodingBat();

    @org.junit.Test
    public void noTriples() {
        assertEquals(false,cosik.noTriples(new int[] {1, 1, 1, 2, 2, 2, 1}) );
    }



    @Test
    public void testStringBits() {
        assertEquals("Hlo",cosik2.stringBits("Hello"));
    }
}