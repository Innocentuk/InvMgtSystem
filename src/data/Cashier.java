package data;

public class Cashier {
	
	private String userName;
	private String pswd;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String name) {
		this.userName = name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

}
