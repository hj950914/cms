package com.jluster.cms.advice;

import com.jluster.cms.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Author: hj
 * Date: 2019-06-04 16:36
 * Description: 用户的增强类
 */
@Configuration
@Aspect
public class UserAdvice {

    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.jluster.cms.service.UserService.findUser(*))")
    public void pointcut() {
    }

    /**
     * 后置通知
     *
     * @param joinPoint
     */
    @AfterReturning(value = "pointcut()", returning = "returnValue")
    public void doBefore(JoinPoint joinPoint, Object returnValue) {
        User user = (User) returnValue;
        if (user != null) {
            //System.out.println("********用户登录之后将用户" + user.getLogin() + "会话保存到redis中*******");
        }
    }

}
