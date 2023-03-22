package exception.com;

public class Demo1 {
	private String getName (int id) throws NoDataFoundException {
		if (id== 100) {
			return "raju";
		}else if (id==101) {
			return "rani";
		}else {
			throw new NoDataFoundException();
		}
		
	}


     public static void main (String [] args) throws NoDataFoundException {
    	 Demo1 d= new Demo1();
    	 d.getName(200);
     }
     
}   
