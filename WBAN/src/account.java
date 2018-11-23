
public class account {
	
	public static int balance;
	
	public void setAmm (int value) {
	balance += value;
	
	}

	public void setDraw (int value) {
		balance -= value;
		
		}
	
	public void getAmm() {
		System.out.println("Current balance: "+ balance+ "£");
		
	}
	
	public int getCheck() {
		return balance;
	}
}
