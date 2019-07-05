package com.arc.aop.service;

import com.arc.aop.model.domain.SysUser;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface SysUserService {

    void init();

    Long save(SysUser SysUser);

    int delete(Long id);

    int update(SysUser SysUser);

    SysUser get(Long id);

    List<SysUser> list();


    List<SysUser> test();

    Object  testService();


}
