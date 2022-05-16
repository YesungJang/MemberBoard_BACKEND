package com.testfullstack.membersystem.controller;

import com.testfullstack.membersystem.model.Member;
import com.testfullstack.membersystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {
  @Autowired
  private MemberService memberService;

  // request bodyによるpost時
  @PostMapping("/add")
  public String add(@RequestBody Member member){
    memberService.saveMember(member);
    return "New Member is added";
  }

  // URL parameterによるpost

  @GetMapping
  public Member member(@RequestParam("id") int id){
    return memberService.getMember(id);
  }

  @GetMapping("getAll")
  public List<Member> getAllMembers(){
    return memberService.getAllMembers();
  }
}
