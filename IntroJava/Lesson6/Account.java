
public class Account {
	private static final int DEFAULT_MAX = 3;
	private String username;
	private String password;
	private int attemptsRemaining;
	private String data;
	
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
		this.attemptsRemaining = DEFAULT_MAX;
		this.data = null;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getData(String username, String password) {
		data = "Unable to log in.";
		if (this.login(username, password)) {
			data = this.data;
		}
		return data;
	}
	
	public boolean setData(String username, String password, String data) {
		boolean success = false;
		if (this.login(username, password)) {
			this.data = data;
			success = true;
		}
		return success;
	}
	
	private boolean login(String username, String password) {
		boolean success = false;
		if (attemptsRemaining > 0) {
			if (username.equals(this.username) && password.equals(this.password)) {
				success = true;
				this.attemptsRemaining = DEFAULT_MAX;
			}
			else {
				this.attemptsRemaining --;
			}
		}
		return success;
	}
}
