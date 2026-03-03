package com.yating.xiaolvshu.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yating
 * @Date: 2026/3/3 15:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {
    //启用
    ENABLE(0),
    //禁用
    DISABLE(1);
    private final Integer value;
}
