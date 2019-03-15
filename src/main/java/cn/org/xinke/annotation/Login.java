package cn.org.xinke.annotation;

import java.lang.annotation.*;

/**
 * @description 登录授权
 * @author cinco
 * @date 2019-3-15
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface Login {

    /** 权限认证角色名称 */
    String authentication() default "";
}