public class deposit {

	body again = new body();
	
	account check = new account();
	
	public void depoin(int wd) {
		if (wd >= 1) {
			check.setAmm(wd);
			
		}else {
			System.out.println("ERROR: sum must be greater than 1£");
			body.main(null);
			
		}
		
	}
}

