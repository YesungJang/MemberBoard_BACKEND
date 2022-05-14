package com.testfullstack.membersystem.controller;

import com.testfullstack.membersystem.model.Member;
import com.testfullstack.membersystem.model.Post;
import com.testfullstack.membersystem.service.MemberService;
import com.testfullstack.membersystem.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin
public class PostController {
  @Autowired
  private PostService postService;

  @PostMapping("/add")
  public String add(@RequestBody Post post){
    postService.savePost(post);
    return "New Post is added";
  }

  @GetMapping("getAll")
  public List<Post> getAllPosts(){
    return postService.getAllPosts();
  }
}
