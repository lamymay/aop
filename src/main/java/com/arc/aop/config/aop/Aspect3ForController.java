package com.arc.aop.config.aop;

//import com.alibaba.fastjson.JSON;

import com.arc.aop.config.model.exception.BizRuntimeException;
import com.arc.aop.model.vo.ResponseVo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * AOP切面，记录方法的调用，入参以及出參
 * //https://www.cnblogs.com/kanyun/p/7818529.html
 *
 * @author yechao
 * @date 2018/10/15
 */
@Aspect//切面
@Component
public class Aspect3ForController {

    private final static Logger log = LoggerFactory.getLogger(Aspect3ForController.class);

    /**
     * 切点
     */
    //execution 表达式
    @Pointcut("execution(public * com.arc.aop.controller.*Controller.*(..))")
    public void pointcut() {
    }


    @Pointcut("execution(public * com.arc.aop.service.*.*(..))")
    public void pointcut2() {
    }

    @Pointcut("execution(public * com.arc.aop.controller.*.*(..))")
    public void pointcut3() {
    }


    /**
     * 环绕通知
     * Around Advice 围绕连接点执行
     * 我们使用@Around来捕获异常信息，并用之前定义好的Result进行异常的返回
     *
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        log.debug("AROUND----------------------------------");
        ResponseVo result = null;
        long startTime = System.currentTimeMillis();
        try {
            result = (ResponseVo) proceedingJoinPoint.proceed();
            long processTime = System.currentTimeMillis();
            log.info("业务耗时={}ms", (processTime - startTime));

        } catch (Throwable e) {
            long processThrowableTime = System.currentTimeMillis();
            result = handlerException(e);
            log.info("处理异常耗时={}ms，方法总耗时={}ms", (System.currentTimeMillis() - processThrowableTime), (System.currentTimeMillis() - startTime));

        }

        return result;
    }


    @Around("pointcut2()")
    public Object doAround2(ProceedingJoinPoint proceedingJoinPoint) {
        log.debug("22222----------------------------------");
        ResponseVo result = null;
        try {
            long startTime = System.currentTimeMillis();
            result = (ResponseVo) proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis() - startTime;

            log.info("业务耗时：" + endTime);
        } catch (Throwable e) {
            result = handlerException(e);
        }
        return result;
    }

    @Around("pointcut3()")
    public Object doAround3(ProceedingJoinPoint proceedingJoinPoint) {
        log.debug("33333 for test pack ----------------------------------");
        ResponseVo result = null;
        try {
            long startTime = System.currentTimeMillis();
            result = (ResponseVo) proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis() - startTime;

            log.info("业务耗时：" + endTime);
        } catch (Throwable e) {
            result = handlerException(e);
        }
        return result;
    }

    private ResponseVo handlerException(Throwable e) {

        if (e instanceof BizRuntimeException) {
            return ResponseVo.failure(((BizRuntimeException) e).getCode(), ((BizRuntimeException) e).getMsg());
        }
        return ResponseVo.failure(-1, e.toString());
    }

    //
//    aspectJ切面通过ProceedingJoinPoint想要获取当前执行的方法：
//
//    错误方法：
//
//
//
//                 Signature s = pjp.getSignature();
//    MethodSignature ms = (MethodSignature)s;
//    Method m = ms.getMethod();
//
//    这种方式获取到的方法是接口的方法而不是具体的实现类的方法，因此是错误的。
//
//
//
//    正确方法：
//
//                    Signature sig = pjp.getSignature();
//        MethodSignature msig = null;
//        if (!(sig instanceof MethodSignature)) {
//            throw new IllegalArgumentException("该注解只能用于方法");
//        }
//        msig = (MethodSignature) sig;
//        Object target = pjp.getTarget();
//        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
//
//
//---------------------
//    作者：宴宴于飞
//    来源：CSDN
//    原文：https://blog.csdn.net/meiyang1990/article/details/50562046
//    版权声明：本文为博主原创文章，转载请附上博文链接！

    public static void main(String[] args) {
        Integer a = 1232;
        Integer b = 1232;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        //21 4748 3647
        System.out.println(Integer.MAX_VALUE);
        //2的31次方-1,7个f   4byte*8=32          int型占空间是4个字节，32位二进制数，从0开始，是2的31次方减一
        System.out.println(0x7fffffff);
        System.out.println(0x7);
        System.out.println("fffffff".length());
    }
}
