package com.onesoft.c_Exception_;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Start");
		try
		{int a=10;
		int b=0;
		System.out.println(a/b);
		}
		finally {
			System.out.println("Welcome");
		}
		System.out.println("End");
	}

}
