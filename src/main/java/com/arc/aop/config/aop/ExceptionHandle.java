//package com.arc.aop.config.aop;
//
//import com.arc.aop.config.model.exception.BizRuntimeException;
//import com.arc.aop.model.vo.ResponseVo;
//import com.fasterxml.jackson.databind.exc.InvalidFormatException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * @author yechao
// * @date 2018/10/15
// * 错误定义
// */
//@ControllerAdvice
//public class ExceptionHandle {
//
//    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
//
//    /**
//     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
//     *
//     * @param e
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public ResponseVo handleException(Exception e) {
//        ResponseVo failure = ResponseVo.failure("错误31");
//        logger.debug("##########################\n{}", e.getMessage()+e.getCause());
//        logger.error("       failure={}---{}", failure, e);
//        logger.debug("##########################");
//        return failure;
//    }
//
//    /**
//     * 业务运行时异常返回处理
//     *
//     * @param e
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    @ExceptionHandler(value = BizRuntimeException.class)
//    @ResponseBody
//    public ResponseVo handleBusinessRuntimeException(BizRuntimeException e) {
//        ResponseVo failure = new ResponseVo(e.getCode(), e.getMsg(), false, null);
//        logger.error("failure={}---{}", failure, e);
//        return failure;
//    }
//    @ExceptionHandler(value = InvalidFormatException.class)
//    @ResponseBody
//    public ResponseVo handleInvalidFormatException(InvalidFormatException e) {
//        ResponseVo failure = ResponseVo.failure("数据格式错误");
//        logger.error("数据格式错误={}---{}", failure, e);
//        return failure;
//    }
//
//}
