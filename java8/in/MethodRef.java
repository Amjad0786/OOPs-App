package java8.in;

import java.util.function.Consumer;

interface MyInterface{
	public void m1 ();
}

public class MethodRef {
	
	public static void m2 () {
		System.out.println("this is m2() method");
	}
	
	public static void main(String[] args) {
		MyInterface mi = MethodRef::m2 ;
		mi.m1();
		
		
	}

}
