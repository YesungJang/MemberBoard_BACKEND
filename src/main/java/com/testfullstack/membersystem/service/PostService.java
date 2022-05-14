package com.testfullstack.membersystem.service;

import com.testfullstack.membersystem.model.Post;

import java.util.List;

public interface PostService {
  public Post savePost(Post post);
  public List<Post> getAllPosts();
}
