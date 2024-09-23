package com.seonhui.app.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	public int memberJoin(MemberVO memberVO) throws Exception;
}
