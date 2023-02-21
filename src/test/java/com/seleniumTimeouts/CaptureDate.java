package com.seleniumTimeouts;

import com.helper.Utility;

public class CaptureDate {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		Utility.waitForSeconds(2);
		System.out.println(System.currentTimeMillis());
		Utility.waitForSeconds(2);
		System.out.println(System.currentTimeMillis());
        Utility.waitForSeconds(2);
		System.out.println(System.currentTimeMillis());
        Utility.waitForSeconds(5);
	}

}
