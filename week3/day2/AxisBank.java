package assignment.week3.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit with interest 6.5%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
	}	
}

