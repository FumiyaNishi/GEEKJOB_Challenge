package org.camp.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class challenge1508 {

	public static void main(String[] args) throws IOException { //例外が発生したら何もしない
			File file = new File("profile.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("私の名前はです．\n");
			fw.write("よろしくお願いします．\n");
			fw.close();
	}

}