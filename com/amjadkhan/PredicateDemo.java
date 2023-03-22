package com.amjadkhan;

import java.util.function.Predicate;

public class PredicateDemo {
     

	public static void main(String[] args) {
		String[]names = {"Amjad" , "Ashraf" ,"Azaam" ,"Wasim"};
		
		Predicate<String> p = name -> name.charAt(4)== 'd';
		
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}

	}
}
