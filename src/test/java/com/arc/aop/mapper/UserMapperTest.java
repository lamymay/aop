//package com.arc.aop.mapper;
//
//import com.arc.aop.model.domain.SysUser;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @author: 叶超
// * @since: 2019/2/18 10:31
// */
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserMapperTest {
//
//    @Resource
//    private SysUserMapper userMapper;
//
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<SysUser> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//    }
//
//    @Test
//    public void testPage() {
//        SysUser user = (SysUser) userMapper.selectById(1L);
//        log.debug("结果={}", user);
//        log.debug("结果={}", user);
//        log.debug("结果={}", user);
//
//    }
//
//
//}
