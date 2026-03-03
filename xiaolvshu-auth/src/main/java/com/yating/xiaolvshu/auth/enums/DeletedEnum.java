package com.yating.xiaolvshu.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yating
 * @Date: 2026/3/3 15:09
 * @Version: v1.0.0
 * @Description: 逻辑删除
 **/
@Getter
@AllArgsConstructor
public enum DeletedEnum {
    YES(true),
    NO(false);

    private final Boolean value;
}
