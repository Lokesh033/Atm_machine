package atm;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		int atmno = 123;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcom to ATM machine");
		System.out.println("enter atm_no: ");
		int atmNo = sc.nextInt();
		System.out.println("enter atm_pin: ");
		int atmPin = sc.nextInt();
		
		AtmOperationIntf op=new AtmOperationImp();

		if (atmNo == atmno && atmPin == atmpin) {
			
			boolean flag=true;
			while (flag) {
				System.out.println(
						"1.View Available Balance\n2.Withdraw Amount\n3.deposit Amount\n4.View Mini Statement\n5.exit");
				System.out.println("enter the choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1: {
					op.viewBalance();
				}
					break;

				case 2: {
					System.out.println("enter the amount to Withdraw ");
					double withdrawamount=sc.nextDouble();
					op.withdrawAmount(withdrawamount);
					
				}
					break;

				case 3: {
					System.out.println("enter the amount to deposit");
					double depositamount=sc.nextDouble();
					op.depositAmount(depositamount);
				}
					break;

				case 4: {
					
					op.viewMiniStatement();
				}
					break;
					
				case 5: {
					flag=false;
					System.out.println("collect your Atm Card\nThank You");
				}
					break;
				default:{
					System.out.println("Please enter correct choice");
				}
					break;
				}

			}

		} else {
			System.out.println("Incorrect atmno or atmpin");
		}
	}

}
