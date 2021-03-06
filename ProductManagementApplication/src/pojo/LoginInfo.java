package pojo;
// 2222222222222222222222222222

// classe to hold info from db
public class LoginInfo {
	String userName;
	String password;
	
	public LoginInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LoginInfo() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfo [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
