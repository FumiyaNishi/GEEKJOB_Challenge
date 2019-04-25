package org.camp.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

public class challenge1510 {

	static void writeLog(File file, String progress) throws IOException {
		Calendar current = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		FileWriter fw = new FileWriter(file, true);
		fw.append(sdf.format(current.getTime()) + " " + progress + "\n");
		fw.close();
	}

	static void printLog(File file) throws IOException {
	  BufferedReader br = new BufferedReader(new FileReader(file));
	    String line;
	    while((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
	    br.close();
	}

	public static void main(String[] args) throws IOException {
		File logFile = new File("log.txt");
		writeLog(logFile, "開始");

		HashSet<Integer> hSet = new HashSet<>(); //順番を持たず、重複を許さない配列
		hSet.add(2);
		hSet.add(1);
		hSet.add(3);
		hSet.add(1);

		Iterator iter = hSet.iterator();  //コレクションを使用するときに便利
		while(iter.hasNext()) { //次の要素があるとき真
		    System.out.println(iter.next());
		}

		writeLog(logFile, "終了");
		printLog(logFile);
	}

}