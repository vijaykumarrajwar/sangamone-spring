package com.example.SmallWebApp;

public class UserRegister {
	private String email;
	 public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	@Override
	public String toString() {
		return "UserRegister [email=" + email + ", psw=" + psw + ", pswrepeat=" + pswrepeat + ", UName=" + UName + "]";
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPswrepeat() {
		return pswrepeat;
	}
	public void setPswrepeat(String pswrepeat) {
		this.pswrepeat = pswrepeat;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	private String psw;
	 private String pswrepeat;
	 private String UName;
}