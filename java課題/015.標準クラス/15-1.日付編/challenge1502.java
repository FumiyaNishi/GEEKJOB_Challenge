package org.camp.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class challenge1502 {

	public static void main(String[] args) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
	    Date now = new Date(); //defaltは現在時刻
	    System.out.print(sdf.format(now));
	}

}