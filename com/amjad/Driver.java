package com.amjad;

class Doctor {
	String name;
	int age;
}

public class Driver {

	void print(Doctor d) {
		System.out.println(d.name + "  " + d.age);

	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Doctor d1 = new Doctor();
		d1.name = "Mr.khan";
		d1.age = 35;
		d.print(d1);

	}

}
