package com.seonhui.app.member;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "MEMBERS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberNum;
	@Column(unique = true)
	private String memberId;
	@Column
	private String memberPassword;
	@Column
	private String memberName;
	@Column
	private String memberNickname;
	@Column
	private String memberMobile;
	@Column
	private String memberEmail;
	@Column
	private Date memberBirthday;
}
