package com.yating.xiaolvshu.auth.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * @Author: yating
 * @Date: 2026/3/2 20:05
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDO {

    private Long id;

    private String username;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}