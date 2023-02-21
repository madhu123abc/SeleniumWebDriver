package com.seleniumgrid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test()
	public void test1() {
		Assert.assertEquals(12, 12 ,"Count Missmatch");
	}
	@Test()
	public void test2() {
		Assert.assertEquals(12, 12,"Count Missmatch");
	}
	@Test()
    public void test3() {
		Assert.assertEquals(12, 12.0, "Count miassmatch");
    	
    }
	@Test()
    public void test4() {
		Assert.assertEquals("Selenium is for WebAutomation", "Selenium is for WebAutomation", "Count missmatch");
    	
    }
	@Test()
    public void test5() {
		String msg ="Customer Id =122209";
		Assert.assertEquals(msg.contains("Customer"),true);
		
    	
    }
	@Test()
    public void test6() {
		String msg ="Customer Id =122209";
		Assert.assertEquals(msg.contains("Customer"),true);
		
    	
    }
	@Test()
    public void test7() {
		String msg ="Customer Id =122209";
		Assert.assertTrue(msg.contains("Id"));
		
    	
    }
	@Test()
    public void test8() {
		String msg ="Customer Id =122209";
		Assert.assertFalse(msg.contains("is"));
		
    	
    }

}
