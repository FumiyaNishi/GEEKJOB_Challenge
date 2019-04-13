package org.camp.servlet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class challenge1503 {

	public static void main(String[] args) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(2016, 10, 4, 10, 0, 0);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    System.out.print(sdf.format(cal.getTime())); //かれんだー型　⇨　string
	}

}