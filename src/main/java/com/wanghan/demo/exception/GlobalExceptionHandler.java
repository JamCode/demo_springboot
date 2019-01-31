package com.wanghan.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//
//    }
}
