package kr.co.juhun.memb;

import java.io.Serializable;

public class MemberDTO implements Serializable {
     protected String id;
     protected String pw;
     protected String pwch;
     protected String irum;
     protected String nickname;
     protected String email;
     protected String smscheck;
     protected String emailcheck;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String id, String pw, String pwch, String irum, String nickname, String email, String smscheck,
			String emailcheck) {
		super();
		this.id = id;
		this.pw = pw;
		this.pwch = pwch;
		this.irum = irum;
		this.nickname = nickname;
		this.email = email;
		this.smscheck = smscheck;
		this.emailcheck = emailcheck;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPwch() {
		return pwch;
	}
	public void setPwch(String pwch) {
		this.pwch = pwch;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSmscheck() {
		return smscheck;
	}
	public void setSmscheck(String smscheck) {
		this.smscheck = smscheck;
	}
	public String getEmailcheck() {
		return emailcheck;
	}
	public void setEmailcheck(String emailcheck) {
		this.emailcheck = emailcheck;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", pwch=" + pwch + ", irum=" + irum + ", nickname=" + nickname
				+ ", email=" + email + ", smscheck=" + smscheck + ", emailcheck=" + emailcheck + "]";
	}
     
     
}
