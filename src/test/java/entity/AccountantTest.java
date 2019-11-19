package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountantTest {

    @Test
    public void jsonWriter() {
        boolean actual= Accountant.jsonWriter();
        boolean expected = true;
        assertEquals(expected,actual);
    }
}