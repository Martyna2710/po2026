package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cosik=new CodingBat();

    @org.junit.Test
    public void TestnoTriples() {
        assertEquals(false,cosik.noTriples(new int[] {1,1,1,2,2,2,1}) );
        assertEquals(false,cosik.noTriples(new int[] {1,1,2,2,2,1}) );
        assertEquals(true,cosik.noTriples(new int[] {1,2,1}) );
        assertEquals(true ,cosik.noTriples(new int[] {}) );
    }

    @Test
    public void TestStringBits() {
        assertEquals("Hlo",cosik.stringBits("Hello"));
        assertEquals("H",cosik.stringBits("H"));
        assertEquals("Hello",cosik.stringBits("Heeololeo"));
        assertEquals("HHH",cosik.stringBits("HiHiHi"));
    }

    @Test
    public void Testsum13() {
        assertEquals(22, cosik.sum13(new int[] {1,2,3,16}));
        assertEquals(6, cosik.sum13(new int[] {1,2,3,13,5}));
        assertEquals(40, cosik.sum13(new int[] {1,1,2,4,5,8,13,7,9,10}));
        assertEquals(5, cosik.sum13(new int[] {13,13,13,13,1,5,13,6}));
    }

    @Test
    public void TesthelloName(){
        assertEquals("Hello Martyna!", cosik.helloName("Martyna"));
        assertEquals("Hello Ola!", cosik.helloName("Ola"));
        assertEquals("Hello Marek!", cosik.helloName("Marek"));
        assertEquals("Hello xyz!", cosik.helloName("xyz"));
    }

    @Test
    public void TestcountCode() {
        assertEquals(1, cosik.countCode("aaacodebbb"));
        assertEquals(2, cosik.countCode("codexxcode"));
        assertEquals(2, cosik.countCode("cozexxcope"));
        assertEquals(1, cosik.countCode("cozfxxcope"));
    }
}