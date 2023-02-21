package com.seleniumTimeouts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate1 {

	public static void main(String[] args) {
		Date d =new Date();
        System.out.println(d);
       
		SimpleDateFormat customDateFormat =new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy ");  
       String date =customDateFormat.format(d);
        System.out.println(date);
        
        //another way u can write directly like this
        String date1 =new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy ").format(d); 

        
        
        
        
        
        
	}

}
