package org.camp.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class challenge1509 {

	public static void main(String[] args) throws IOException { //例外が発生したら何もしない
			File file = new File("profile.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
	}

}