package com.pooh.home.member;

public class MemberDTO {
//230130 2교시
	
	//erdcloud 보고 member의 DTO 만들기
	private String id;
	private String pw;
	private String memberName;
	private String memberPhone;
	private String email;
	
	//default constructor
	public MemberDTO () {
		
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
