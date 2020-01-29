package ch06.exam08_method_access.pkg;

public class MyInfo {
	
	public String name;
	private int bankAccount;
	
	//생성자
	public MyInfo(String name, int bankAccount) {
		this.name = name;   
		this.bankAccount = bankAccount;   
	}
	
	public int getBankAccount() {
		return this.bankAccount;
	}

}
