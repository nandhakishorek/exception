package com.onesoft.c_Exception_;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
		String[] words= {"sun","moon","star"};
		System.out.println(words[0].charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch(IndexOutOfBoundsException b) {
			System.out.println(b);
		}
		catch(RuntimeException c) {
			System.out.println(c);
		}
		catch(Exception d) {
			System.out.println(d);
		}
	}

}
