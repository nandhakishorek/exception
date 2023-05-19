package com.onesoft.c_Exception_;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
	public static void main(String[] args) throws IOException {
		try {
		File f=new File("C:\\Users\\BALAMURUGAN\\Desktop\\nandh.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while ((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(IOException a) {
			System.out.println(a);
		}
	}

}
