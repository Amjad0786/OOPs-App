package java8.in;

import java.util.function.Supplier;

public class Test {
	
	public static void main(String[] args) {
		Supplier<Doctor> s = Doctor::new;
		Doctor d = s.get();
		System.out.println(d.hashCode());
		
	}
}
class Doctor{
	
	public Doctor () {
		System.out.println("Doctor constructor....");
	}
}
