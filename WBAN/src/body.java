
import java.util.InputMismatchException;
import java.util.Scanner;


public class body {
	
	String temp;
	
	@SuppressWarnings("resource")
	public static void main (String [] arg) {
		deposit depo = new deposit();
		withdraw wdwd = new withdraw();
		statement stm = new statement();
		Scanner input = new Scanner(System.in);



		 System.out.println("Please Type one of the following to proceed:");
		 System.out.println("1--Deposit");
		 System.out.println("2--WithD");
		 System.out.println("3--Statement");	
		 int temp = 0;
		 try {
			 temp = input.nextInt();		

		 if (temp == 1) {
			 System.out.println("Insert ammount to deposit..");
			 int temp1 = input.nextInt();
			 depo.depoin(temp1);
			 System.out.println(temp1 + "£ have been deposited.");

		 }else if (temp == 2) {
			 System.out.println("Insert ammount to withdraw..");
			 int temp1 = input.nextInt();
			 wdwd.depoOut(temp1);
			 System.out.println(temp1 + "£ have been withdrawn");

			 
		 }else if (temp == 3) {
			 stm.statementer();

		 }else {
		 System.out.println("Please selecet from the previous options");
	
		 }
		 
		 }catch(InputMismatchException e){
			 System.out.println("Please only input Integer numbers");

		 }
		 

		 body.main(null);
		 }

}