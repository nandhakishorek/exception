package com.onesoft.c_Exception_;

public class NullPointer {
	public static void main(String[] args) {
		try{
			String a=null;
		System.out.println(a.length());
		}
		catch(NullPointerException b) {
			System.out.println(b);
		}
	}


}
