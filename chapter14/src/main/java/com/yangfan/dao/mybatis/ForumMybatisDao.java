package com.yangfan.dao.mybatis;

import com.yangfan.domain.Forum;

import java.util.List;

public interface ForumMybatisDao {
    void addForum(Forum forum);
    void updateForum(Forum forum) ;
    Forum getForum(int forumId) ;
    long getForumNum() ;
    List<Forum> findForumByName(String forumName);
}