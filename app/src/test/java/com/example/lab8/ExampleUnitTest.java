package com.example.lab8;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExampleUnitTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("ValidPass123"));
    }

    @Test
    public void testNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("lowercase123"));
    }

    @Test
    public void testNoLowerCase() {
        assertFalse(PasswordValidator.isValidPassword("UPPERCASE123"));
    }

    @Test
    public void testNoNumber() {
        assertFalse(PasswordValidator.isValidPassword("NoNumberHere"));
    }

    @Test
    public void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Short1"));
    }





}