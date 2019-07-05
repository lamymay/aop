package com.arc.aop.service.impl;

import com.arc.aop.config.model.exception.BizRuntimeException;
import com.arc.aop.model.domain.SysUser;
import com.arc.aop.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 叶超
 * @since 2018/12/26 11:28
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {


    private static List<SysUser> users = new ArrayList<>(10);


    static {
//    private Long id;// 自增id
//    private String nickname;// 用户昵称
//    private String avatar;// 头像
//    private Integer status;// 账号状态  天然false 不需要null的类型
//    private Date createDate;// 创建时间
//    private Date updateDate;// 更新时间
        SysUser user1 = new SysUser(1L, "动感", "111", 1, new Date(), new Date());
        SysUser user2 = new SysUser(2L, "测试", "222", 1, new Date(), new Date());
        SysUser user3 = new SysUser(3L, "爱的", "333", 1, new Date(), new Date());
        SysUser user4 = new SysUser(4L, "符合", "444", 1, new Date(), new Date());
        System.out.println("--------------------------------------------------");
        System.out.println(users.size());
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        System.out.println(users.size());
        System.out.println("--------------------------------------------------");
    }


    @Override
    public void init() {
//    private Long id;// 自增id
//    private String nickname;// 用户昵称
//    private String avatar;// 头像
//    private Integer status;// 账号状态  天然false 不需要null的类型
//    private Date createDate;// 创建时间
//    private Date updateDate;// 更新时间
//        SysUser user1 = new SysUser(1L, "动感", "111", 1, new Date(), new Date());
//        SysUser user2 = new SysUser(2L, "测试", "222", 1, new Date(), new Date());
//        SysUser user3 = new SysUser(3L, "爱的", "333", 1, new Date(), new Date());
//        SysUser user4 = new SysUser(4L, "符合", "444", 1, new Date(), new Date());
//        System.out.println("--------------------------------------------------");
//        System.out.println(users.size());
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
        System.out.println(users.size());
        System.out.println("INIT--------------------------------------------------");
    }

    @Override
    public Long save(SysUser user) {
        boolean add = users.add(user);
        return add ? user.getId() : 0;
    }

    @Override
    public int delete(Long id) {
//        users
        return 1;
    }

    @Override
    public int update(SysUser user) {
        log.debug("#############################");
//        Integer update = sysUserMapper.updateById(user);
        log.debug("#############################");

        return 1;
    }


    @Override
    public SysUser get(Long id) {


        return users.get(1);
    }

    @Override
    public List<SysUser> list() {
        return users;
    }


    @Override
    public List<SysUser> test() {

        BizRuntimeException bizRuntimeException = new BizRuntimeException();
        throw bizRuntimeException;
    }


    @Override
    public Object testService() {
        int a = 1 / 0;
        return a;
    }
}
