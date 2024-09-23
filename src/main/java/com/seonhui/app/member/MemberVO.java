package com.seonhui.app.member;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberNickname;
	private String memberMobile;
	private String memberEmail;
	private Date memberBirthday;
}
