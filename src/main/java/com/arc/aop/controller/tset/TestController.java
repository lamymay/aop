package com.arc.aop.controller.tset;

import com.arc.aop.model.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/5/31 14:50
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/info")
    public ResponseVo info() {
        List list = null;
        list.add(1);
        return ResponseVo.success(list);
    }

}
