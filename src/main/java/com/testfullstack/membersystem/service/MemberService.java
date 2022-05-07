package com.testfullstack.membersystem.service;

import com.testfullstack.membersystem.model.Member;

import java.util.List;

public interface MemberService {
  public Member saveMember(Member member);
  public List<Member> getAllMembers();
}
