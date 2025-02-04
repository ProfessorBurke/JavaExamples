
public class BuggyAccountProgram {
	
	private static String USERNAME1 = "User1";
	private static String PASSWORD1 = "Password1";
	private static String USERNAME2 = "User2";
	private static String PASSWORD2 = "Password2";
	
	public static void setData(BuggyAccount account, String data) {
		account.setData(USERNAME1,  PASSWORD1, data);
	}

	public static void main(String[] args) {
		BuggyAccount account1, account2;
		account1 = new BuggyAccount(USERNAME1, PASSWORD1);
		account2 = new BuggyAccount(USERNAME2, PASSWORD2);
		
		setData(account1, "Hello world");
		System.out.println(account1.getData(USERNAME1, PASSWORD1));
		setData(account2, "Hello again world");
		System.out.println(account2.getData(USERNAME1, PASSWORD1));
	}

}
