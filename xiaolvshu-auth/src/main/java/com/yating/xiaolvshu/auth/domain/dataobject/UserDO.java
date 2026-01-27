package com.yating.xiaolvshu.auth.domain.dataobject;

import lombok.AllArgsConstructor;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDO {
    private Long id;

    private String username;

    private Date createTime;

    private Date updateTime;

}