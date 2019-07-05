package com.arc.aop.controller.data.system;

import com.arc.aop.model.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶超
 * @since 2019/5/31 14:51
 */
@Slf4j
@RequestMapping("/user/group")
@RestController
public class UserGroupController {

    @GetMapping("/info")
    public ResponseVo info() {
        int a = 1 / 0;
        return ResponseVo.success();
    }
}
