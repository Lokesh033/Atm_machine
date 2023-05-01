package atm;

import java.util.HashMap;

public class AtmOperationImp implements AtmOperationIntf{
	ATM atm=new ATM();
	HashMap<Double,String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance: "+atm.getBalance());
		
	}

	@Override
	public void depositAmount(double depositamount) {
		ministmt.put(depositamount, " Amount deposited!!");
		System.out.println(depositamount+" Sucsessfully deposited!!");
		atm.setBalance(atm.getBalance()+depositamount);
		viewBalance();
		
	}

	@Override
	public void withdrawAmount(double withdrawamount) {
		ministmt.put(withdrawamount, " Amount Withdrwan");
		if(withdrawamount%500==0){
		if(withdrawamount<=atm.getBalance()){
		System.out.println("collect the cash  "+withdrawamount);
		atm.setBalance(atm.getBalance()-withdrawamount);
		viewBalance();
		}
		else{
			System.out.println("Insufficent Balance");
		}
		}
		else{
			System.out.println("please enter amount in multiple of 500");
		}
	}

	@Override
	public void viewMiniStatement() {
		for(HashMap.Entry<Double,String> m:ministmt.entrySet())
		System.out.println(m.getKey()+" "+m.getValue());
	}

	
}
