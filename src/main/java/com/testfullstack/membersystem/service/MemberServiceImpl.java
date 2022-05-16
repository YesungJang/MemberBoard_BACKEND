package com.testfullstack.membersystem.service;

import com.testfullstack.membersystem.model.Member;
import com.testfullstack.membersystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

  @Autowired
  private MemberRepository memberRepository;

  //controll + oでoverride自動化
  @Override
  public Member saveMember(Member member) {
    return memberRepository.save(member);
  }

  @Override
  public List<Member> getAllMembers() {
    return memberRepository.findAll();
  }

  @Override
  public Member getMember(int id) {
    return memberRepository.getById(id);
  }
}
