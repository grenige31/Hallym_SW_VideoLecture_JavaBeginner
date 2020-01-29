package ch06.exam08_method_access.pkg;

public class BankApp {
	public static void main(String args[]) {
		MyInfo mi = new MyInfo("alice",123987);
		mi.name="melda";
		System.out.println(mi.name);
		
//		mi.bankAccount=0109887;
//		System.out.println(mi.bankAccount);
		int ba = mi.getBankAccount();
		System.out.println(ba);
	}
}

