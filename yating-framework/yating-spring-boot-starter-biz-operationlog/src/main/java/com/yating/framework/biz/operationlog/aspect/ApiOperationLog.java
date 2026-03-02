package com.yating.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @Author: yating
 * @Date: 2026/3/2 15:47
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public interface ApiOperationLog {
}
