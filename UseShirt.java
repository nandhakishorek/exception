package com.onesoft.c_Exception_;

public class UseShirt {
	public static void main(String[] args) throws PriceException {
		Shirt s1 = new Shirt("Levis", "XL", 2599, "White");
		Shirt s2 = new Shirt("Puma", "L", 2199, "Red");
		Shirt s3 = new Shirt("DNMX", "M", 2599, "Black");
		Shirt s4 = new Shirt("Peter England", "XL", 2599, "White");
		Shirt[] shirts = { s1, s2, s3, s4 };
		int min = s1.price;
		for (Shirt x : shirts) {
			if (x.price > min) {
				min = x.price;
			}
		}
		if (min >= 2000) {
			throw new PriceException("Costly");
		}
		else {
			System.out.println("Affordable");
		}

	}

}
