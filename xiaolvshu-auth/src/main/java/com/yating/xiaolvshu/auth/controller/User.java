package com.yating.xiaolvshu.auth.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: yating
 * @Date: 2026/3/2 19:38
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
