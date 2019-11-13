package com.yangfan.dao.mybatis;

import com.yangfan.domain.Post;

public interface PostMybatisDao {
    void addPost(Post post);
    Post getPost(int postId);
}
