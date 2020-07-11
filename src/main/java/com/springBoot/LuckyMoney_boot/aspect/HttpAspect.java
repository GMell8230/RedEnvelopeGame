
package com.springBoot.LuckyMoney_boot.aspect;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

/**
* @ClassName: HttpAspect
* @Description: TODO
* @author GMell
* @date 2020年7月11日
* 实现身份认证的切面
*/
@Aspect
@Component
public class HttpAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

	@Pointcut("execution(public * com.springBoot.LuckyMoney_boot.controller.*.*(..))")
	public void log() {
	}
	@Before("log()")
	public void doBefore(JoinPoint joinpoint) {
		logger.info("doBefore!!");
		
		ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		//url
		logger.info("url = {}", request.getRequestURI());
		//method
		logger.info("method = {}", request.getMethod());
		//ip
		logger.info("ip = {}", request.getRemoteAddr());
		//class_method
		logger.info("class_method = {}", joinpoint.getSignature().getDeclaringTypeName() + "."+ joinpoint.getSignature().getName());
		// parma
		logger.info("parma = {}", joinpoint.getArgs());
	}
	
	@After("log()")
	public void doAfter() {
		logger.info("doBefore!!");
	}
	@AfterReturning(returning = "obj", pointcut = "log()")
	public void validReturn(Object obj) {
		logger.info("response:{}",obj.toString());
	}
}
