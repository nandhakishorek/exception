package com.onesoft.c_Exception_;

public class ArrayIndex {
	public static void main(String[] args) {
		try {
		String[] a= {"nandha" , "kishore", "lokesh"};
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
			System.out.println("error");
		}
		}


}
