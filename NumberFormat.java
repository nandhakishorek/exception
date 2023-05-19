package com.onesoft.c_Exception_;

public class NumberFormat {
	public static void main(String[] args) {
		try {
		String a="Nandha72";
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
		catch(NumberFormatException c) {
			System.out.println(c);
			c.printStackTrace();
		}
	}

}
