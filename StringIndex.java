package com.onesoft.c_Exception_;

public class StringIndex {
	public static void main(String[] args) {
		try {
		String a="nandha";
		System.out.println(a.charAt(6));
	}
		catch(Exception b) {
			System.out.println(b);
			System.out.println("Error");
		}
	}
}
