//package com.yangfan.dao.mybatis;
//
//import com.yangfan.domain.Forum;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//
//@Repository
//public class ForumMybatisTemplateDao {
//    @Resource
//    private SqlSessionTemplate sessionTemplate;
//
//    @Resource
//    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
//        this.sessionTemplate = sessionTemplate;
//    }
//
//    public Forum getForum(int forumId) {
//        return (Forum) sessionTemplate.selectOne(
//                "com.smart.dao.mybatis.ForumMybatisDao.getForum",
//                forumId);
//    }
//
//    public Forum getForum2(int forumId) {
//        ForumMybatisDao forumMybatisDao =
//                sessionTemplate.getMapper(ForumMybatisDao.class);
//        return forumMybatisDao.getForum(forumId);
//    }
//}
