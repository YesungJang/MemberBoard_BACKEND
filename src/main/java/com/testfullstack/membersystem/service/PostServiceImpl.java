package com.testfullstack.membersystem.service;

import com.testfullstack.membersystem.model.Post;
import com.testfullstack.membersystem.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

  @Autowired
  private PostRepository postRepository;

  //controll + oでoverride自動化
  @Override
  public Post savePost(Post post) {
    return postRepository.save(post);  }

  @Override
  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }
}
