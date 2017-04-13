/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJava;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guest
 */
public class TestHolder {
    
    public TestHolder() {
    }
    
    @Before
    public void setUp() {
        Calendar cal = new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15);
        this.tested = new Holder("foo","bar","0609080706","test@yopmail.com",cal.getTime());
    }
    
    
    // Tests sur le constructeur 
    
    @Test(expected = NullPointerException.class)
    public void testHolder_NameIsNull() {
        new Holder(null,"bar","0609080706","test@yopmail.com",new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_NameIsEmpty() {
        new Holder("","bar","0609080706","test@yopmail.com",new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_FirstNameIsNull() {
        new Holder("foo",null,"0609080706","test@yopmail.com",new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_FirstNameIsEmpty() {
        new Holder("foo","","0609080706","test@yopmail.com",new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_PhoneIsNull() {
        new Holder("foo","bar",null,"test@yopmail.com",new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_PhoneIsEmpty() {
        new Holder("foo","bar","","test@yopmail.com",new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_EmailIsNull() {
        new Holder("foo","bar","0609080706",null,new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_EmailIsEmpty() {
        new Holder("foo","bar","0609080706","",new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_DateIsNull() {
        new Holder("foo","bar","0609080706","test@yopmail.com",null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_CreateDateInTheFuture() {
        new Holder("foo","bar","0609080706","test@yopmail.com",new GregorianCalendar(2017, Calendar.APRIL, 21, 15, 29, 15).getTime());
    }

    
    // Tests sur les getters
    
    @Test
    public void testGetName() {
        assertEquals("foo",this.tested.getName());
    }
    
    @Test
    public void testGetFirstName() {
        assertEquals("bar",this.tested.getFirstName());
    }
    
    @Test
    public void testGetDate() {
        assertEquals(
                new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15).getTime(),
                this.tested.getDate()
        );
    }
    
    @Test
    public void testGetPhone() {
        assertEquals("0609080706",this.tested.getPhone());
    }
    
    private Holder tested;
    
}
