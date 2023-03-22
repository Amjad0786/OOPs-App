package java8.in;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	public static void main(String[] args) {
		
		StringJoiner sj1 = new StringJoiner("-");
		
		sj1.add("amjad");
		sj1.add("khan");
		sj1.add("software engineer");
		
		System.out.println(sj1);
		
		
		StringJoiner sj2 = new StringJoiner ("-" ,"(",")");
		sj2.add("ashraf");
		sj2.add("khan");
		sj2.add("Sr. Software Engineer");
		
		System.out.println(sj2);
	}

}
