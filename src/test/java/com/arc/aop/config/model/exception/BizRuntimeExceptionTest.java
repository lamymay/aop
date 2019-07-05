package com.arc.aop.config.model.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 叶超
 * @since 2019/4/9 16:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BizRuntimeExceptionTest {



    @Test
    public void getMsg() {
        BizRuntimeException bizRuntimeException = new BizRuntimeException(1, "测试");
        System.out.println(bizRuntimeException.getCode());
        System.out.println(bizRuntimeException.getMsg());
    }


}


