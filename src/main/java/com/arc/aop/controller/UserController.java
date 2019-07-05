package com.arc.aop.controller;

import com.arc.aop.model.domain.SysUser;
import com.arc.aop.model.vo.ResponseVo;
import com.arc.aop.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/3/26 14:12
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/init")
    public ResponseVo init() {
        //userService.init();
        int a = 1 / 0;
        return ResponseVo.success();
    }

    @GetMapping("/init/test/service")
    public ResponseVo init2() {
        return ResponseVo.success(userService.testService());
    }

    @GetMapping("/{p1}/{p2}")
    public ResponseVo pp(@PathVariable String p1, @PathVariable String p2) {
        System.out.println(p1);
        System.out.println(p2);
        return ResponseVo.success(p1 + p2);
    }


    @GetMapping("/get/{id}")
    public ResponseVo getV1(@PathVariable Long id) {
        SysUser data = userService.get(id);
        return ResponseVo.success(data);
    }

    @GetMapping("/list")
    public ResponseVo listV1() {
        List<SysUser> list = userService.list();
        return ResponseVo.success(list);
    }

    @GetMapping("/test/v1")
    public ResponseVo testV1() {
//        int a = 1 / 0;
        List<SysUser> list = null;
//        list = userService.test();
        return ResponseVo.success(list);
    }

}
