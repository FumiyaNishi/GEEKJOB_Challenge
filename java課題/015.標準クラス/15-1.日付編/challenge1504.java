package org.camp.servlet;

import java.util.Calendar;

public class challenge1504 {

	public static void main(String[] args) {
	    Calendar cal1 = Calendar.getInstance();
	    cal1.set(2015, 0, 1, 0, 0, 0);
	    Calendar cal2 = Calendar.getInstance();
	    cal2.set(2015, 11, 31, 23, 59, 59);

	    System.out.print(cal2.getTime().getTime()- cal1.getTime().getTime());
	    //タイムスタンプは一年で生じるわずかな誤差も反映していた
	}

}