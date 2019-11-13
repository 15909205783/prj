package com.yangfan.dao.service;

import com.yangfan.domain.Forum;
import com.yangfan.service.mybatis.BbtForumSerive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMybatisBbtForum {
    @Autowired
    private BbtForumSerive bbtForumSerive;

  /*  @Autowired
    private ForumMybatisTemplateDao forumMybatisTemplateDao;*/

    @Test
    public void testForumMethod(){
        Forum forum = new Forum();
        forum.setForumId(71);
        forum.setForumName("name_71");
        forum.setForumDesc("desc71");
        bbtForumSerive.addForum(forum);

      /*  Forum forum1 = bbtForumSerive.getForum(98);
        Assert.assertEquals("name_98", forum1.getForumName());
        forum1.setForumName("forum98");
        bbtForumSerive.updateForum(forum1);*/
    }
}
