package com.Abstraction;



public  class HdfcBank implements Bank {
	 



	public void MoneyDeposit() {
		 System.out.println("Money Deposit 50000");
	 }


	public void MoneyWithdraw() {
		System.out.println("Money Withdraw 20000");
		
	}

	
	public void CheckBalance() {
		System.out.println("Checking Balance 50000");
		
	}

	
	public void StopApp() {
		System.out.println("Stop our Application");
		
	}
	
	public static void main(String[] args) {
		
		HdfcBank hb = new HdfcBank ();
		hb.MoneyDeposit ();
		hb.MoneyWithdraw();
		hb.CheckBalance();
		hb.StopApp();
		System.out.println(hb);
		
	}

}



     