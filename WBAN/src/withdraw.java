

public class withdraw {

	body again = new body();
	
	account check = new account();
	
	public void depoOut(int wd) {
		
		int temp = check.getCheck();
		
		if (wd > temp) {
			
			System.out.println("Cannot withdraw more money than available balance");
			
		}else if(wd >= 1) {
			
			check.setDraw(wd);
			
		}else {
			
			System.out.println("ERROR: sum must be greater than 1£");
			body.main(null);
		}
		
	}
	}

