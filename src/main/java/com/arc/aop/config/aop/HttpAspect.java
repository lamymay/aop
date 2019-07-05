//package com.arc.aop.config.aop;
//
////import com.alibaba.fastjson.JSON;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author yechao
// * @date 2018/10/15
// * 切面类
// * AOP切面，记录方法的调用，入参以及出參
// */
//@Slf4j
//@Aspect
//@Component
//public class HttpAspect {
//
//    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
//
//    @Autowired
//    private ExceptionHandle exceptionHandle;
//
//    /**
//     * 切点
//     */
//    @Pointcut("execution(public * com.arc.aop.controller.*Controller.*(..))")
//    public void pointcut() {
//    }
//
//    /**
//     * 前置通知
//     * Before Advice 会排除其他异常执行， 保证执行不被大断
//     * 我们使用@Before记录了调用的接口URL，调用的方法，调用方的IP地址以及输入的参数等。在整个接口代码运作期间
//     *
//     * @param joinPoint
//     */
//    @Before("pointcut()")
//    public void doBefore(JoinPoint joinPoint) {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        log.info("----------------------------------");
//        //url
//        logger.info("url={}", request.getRequestURL());
//        //method
//        logger.info("method={}", request.getMethod());
//        //ip
//        logger.info("address={}", request.getRemoteAddr());
//        //class_method
//        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());
//        //args[]
//        logger.info("args={}", joinPoint.getArgs());
//        System.out.println(joinPoint.getArgs());
//        log.debug("---------------BEFORE-------------------");
//        log.debug("---------------debug-------------------");
//        log.info("-------------------info---------------");
//        log.warn("-----------------warn-----------------");
//        log.error("-----------------error-----------------");
//        log.trace("-----------------trace-----------------");
//
//    }
//
//
////    /**
////     * 后置通知
////     * After Advice 无论方法是有异常抛出，还是正常返回，都会执行
////     * 最后我们使用@AfterReturning来记录我们的出參
////     */
////    @After("pointcut()")
////    public void doAfter() {
////        logger.info("\n\ndoAfter方法执行");
////    }
//
//    /**
//     * 返回后通知
//     * AfterAdvice 如果方法无异常抛出，则正常返回
//     * 最后我们使用@AfterReturning来记录我们的出參
//     *
//     * @param object
//     */
////    @AfterReturning(pointcut = "pointcut()", returning = "object")//打印输出结果
////    public void doAfterReturning(Object object) {
////        if (object != null) {
////            logger.info("vo={}", JSON.toJSONString(object));
////        } else {
////            logger.info("vo=null");
////        }
////    }
//
//
//
////
////    /**
////     * 抛出（异常）后通知
////     * After Throwing Advice 如果方法异常抛出，则执行
////     * 最后我们使用@AfterReturning来记录我们的出參
////     *
////     * @param object
////     */
////    @AfterThrowing(pointcut = "pointcut()", throwing = "")
////    public void doAfterThrowing(Object object) {
////        if (object != null) {
////            logger.info("vo={}", JSON.toJSONString(object));
////        } else {
////            logger.info("vo=null");
////        }
////    }
//
//    /**
//     * 环绕通知
//     * Around Advice 围绕连接点执行
//     * 我们使用@Around来捕获异常信息，并用之前定义好的Result进行异常的返回
//     *
//     * @param proceedingJoinPoint
//     * @return
//     * @throws Throwable
//     */
//    @Around("pointcut()")
//    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        // @modify by Rubin 增加参数校验
////        ResponseVo result = null;
////        try {
////            // 获取参数
////            Object[] args = proceedingJoinPoint.getArgs();
////            StringBuilder errorMsgBuilder = new StringBuilder();
////            for (Object arg : args) {
////                if (arg instanceof BaseForm) {
////                    String errorMsg = HibernateValidator.validate(arg); //参数校验
////                    errorMsgBuilder.append(errorMsg);
////                }
////            }
////            if (StringUtils.isNotBlank(errorMsgBuilder.toString())) {
////                logger.info("参数校验出错，错误信息为:{}", errorMsgBuilder.toString());
////                throw new BizRuntimeException(ErrorCode.ILLEGAL_ARGUMENT, errorMsgBuilder.toString());
////            } else {
////                result = (ResponseVo) proceedingJoinPoint.proceed(); //校验通过，继续业务处理
////            }
////        } catch (InvalidFormatException e) {
////            //web端form接受参数的校验出出错
////            return exceptionHandle.handleInvalidFormatException(e);
////        } catch (BizRuntimeException e) {
////            return exceptionHandle.handleBusinessRuntimeException(e);
////        } catch (Exception e) {
////            return exceptionHandle.handleException(e);
////        }
////        return result;
//        //
//
////        proceedingJoinPoint.
//
//        log.debug("AROUND----------------------------------");
//        return proceedingJoinPoint.proceed();
//    }
//
//
//}
