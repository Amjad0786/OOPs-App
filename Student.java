
public class Student {
   public static void main(String[] args)throws Exception {
	 Student s = new Student();
	 Class clz = s.getClass();
	 System.out.println("clz.getName()");
	 System.out.println("s.getclass(). getName()");
	 
	 Object object = clz.newInstance();
	 System.out.println(object);
}

}
