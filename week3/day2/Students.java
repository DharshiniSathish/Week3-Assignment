package assignment.week3.day2;

public class Students {
	
	public void getStudentInfo(int id , String name) {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String eMail , long phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(eMail);
		System.out.println(phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentInfo(002, "Anu");
		obj.getStudentInfo("anu123@gmail.com", 8850316728l);
	}

}
