

public class SBIBank extends RBIBank {
	double getHomeLoanRofi() {
		return 9.85;
	}
  public String applyHomeLoan() {
	  boolean status = checkEligibility ();
	  if(status) {
		  double HomeLoanRofi = getHomeLoanRofi();
		  String msg = "Your Loan approved with RI as::"+ HomeLoanRofi;
		  return msg;
	  }else {
		  return "you are not eligible for home loan";
	  }
  }
  public static void main(String[] args) {
	SBIBank bank = new SBIBank();
	String msg = bank.applyHomeLoan();
	System.out.println(msg);
	
}
}
