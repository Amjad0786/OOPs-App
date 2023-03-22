package java8.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws Exception {
		
		Date d = new Date ();
		System.out.println(d);
		
		//dd/mm/yyyy
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		Date parsedDate = sdf2.parse("1970-12-20");
		System.out.println(parsedDate);
		
		java.sql.Date d1 = new java.sql.Date(20222122);
		System.out.println(d1);
		
		
	}

}
