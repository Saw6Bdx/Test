/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guest
 */
public class CheckTest {
    
    public CheckTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCheckIsNull_String_String() {
        System.out.println("checkIsNull");
        String field = "";
        String name = "";
        Check.checkIsNull(field, name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckIsEmpty() {
        System.out.println("checkIsEmpty");
        String field = "";
        String name = "";
        Check.checkIsEmpty(field, name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckIsNull_Date_String() {
        System.out.println("checkIsNull");
        Date field = null;
        String name = "";
        Check.checkIsNull(field, name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckLetters() {
        System.out.println("checkLetters");
        String field = "";
        String nameField = "";
        Check.checkLetters(field, nameField);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String phone = "";
        Check.checkPhoneNumber(phone);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        String email = "";
        Check.checkEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckDate() {
        System.out.println("checkDate");
        String date = "";
        Check.checkDate(date);
        fail("The test case is a prototype.");
    }
    
}
