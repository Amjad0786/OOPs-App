class Doctor{
	String name;
	int age;
}

class Driver0 {
	public static void main(String[] args) {

		Driver0 d = new Driver0();

		Doctor d1 = new Doctor();
      d1.name="Raja";
      d1.age=29;
      d.m1(d1);
	}

	

void m1(Doctor d1) {
	System.out.println(d1.name+""+d1.age);
}
}