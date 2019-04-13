package org.camp.servlet;

import java.util.Calendar;
import java.util.Date;

public class challenge1501 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	    cal.set(2016, 0, 1, 0, 0, 0);
	    Date date = cal.getTime(); //カレンダー型　⇨　Date型
	    System.out.print(date.getTime()); //Date型 ⇨ タイムスタンプ型
	}

}