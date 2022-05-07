package com.testfullstack.membersystem.controller;

import com.testfullstack.membersystem.model.Member;
import com.testfullstack.membersystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
  @Autowired
  private MemberService memberService;

  @PostMapping("/add")
  public String add(@RequestBody Member member){
    memberService.saveMember(member);
    return "New Member is added";
  }

  @GetMapping("getAll")
  public List<Member> getAllMembers(){
    return memberService.getAllMembers();
  }
}
