package com.onesoft.c_Exception_;

public class VoterAge {
	public static void main(String[] args)  {
		int age = 17;
		try {
			if (age < 18) {

				throw new AgeException("Not Eligible");
			} 
			else {
				System.out.println("Eligible");
			}
		} 
		catch (AgeException a) {
			System.out.println(a);
		}
		System.out.println("End");
	}
}
