package cn.org.xinke.annotation;

import cn.org.xinke.exception.BusinessException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description 登录授权切面
 * @author cinco
 * @date 2019-3-3
 */
@Aspect
@Component
public class LoginAspect {

    @Pointcut("execution(public * cn.org.xinke.controller.*.*(..)) && @annotation(login)")
    public void pointcut(Login login){}

    @Around("pointcut(login)")
    public Object Interceptor(ProceedingJoinPoint pjp, Login login) throws Throwable {
        // 获取请求/响应对象
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        // 登录认证
        String sid = request.getParameter("sid");
        // 未登录,模拟请求秘钥
        String token = "6e300c1579344a37990c13354ccb0f5e";
        if (sid == null || !sid.equals(token)) {
            throw new BusinessException("无效的请求秘钥");
        } else {
            // 权限不匹配进行拦截,模拟权限
            String auth = "admin";
            if (!login.authentication().equals("") && !auth.equals(login.authentication())) {
                throw new BusinessException("权限不足");
            }
        }
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        }
    }
}