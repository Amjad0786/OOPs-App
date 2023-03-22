package com.amjadkhan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name ;
	int age ;
	
	Person(String name , int age){
		this.name=name;
		this.age= age;
	}
		
}
public class PredicatePersonDemo {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Amjad" , 23) ;
		Person p2 = new Person("Ashraf" ,29) ;
		Person p3 = new Person("Ek" , 23) ;
		Person p4 = new Person("Sameer" , 19) ;
		Person p5 = new Person("shakib" , 15) ;
		
		List<Person> persons= Arrays.asList(p1,p2, p3, p4, p5);
		
	   Predicate<Person> predicate = p -> p.age >= 18;
	   
	   for(Person p : persons) {
		   if (predicate.test(p)) {
			   System.out.println(p .name);
		   }
	   }
	}

}
