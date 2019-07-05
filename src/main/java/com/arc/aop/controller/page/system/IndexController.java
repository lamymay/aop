package com.arc.aop.controller.page.system;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶超
 * @since 2019/5/31 14:50
 */
@Slf4j
@RestController
public class IndexController {

    @GetMapping("/index")
    public String info() {
        return "/index";
    }

}
