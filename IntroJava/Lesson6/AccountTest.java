
public class AccountTest {
	
	private static String USERNAME = "TestUser";
	private static String PASSWORD = "TestPassword";
	private static String WRONG_PASSWORD = "WrongPassword";
	private static String DATA_VALUE = "Data set to this value";

	public static void main(String[] args) {
		
		// Create an account.
		Account testAccount = new Account(USERNAME, PASSWORD);

		// Put it in a locked state.
		for (int i = 0; i < 3; i++) {
			testAccount.setData(USERNAME, WRONG_PASSWORD, DATA_VALUE);
		}
		
		// Test that we get false back if we try to setData with the correct
		// login information.
		for (int j = 0; j < 5; j++) {
			System.out.println(testAccount.setData(USERNAME, PASSWORD, DATA_VALUE));
		}
	}

}
