package com.yating.xiaolvshu.auth.domain.mapper;

import com.yating.xiaolvshu.auth.domain.dataobject.UserDO;

/**
 * @Author: yating
 * @Date: 2026/3/2 20:05
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface UserDOMapper {

    /**
     * 根据主键 ID 查询
     * @param id
     * @return
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据主键 ID 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入记录
     * @param record
     * @return
     */
    int insert(UserDO record);

    /**
     * 更新记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserDO record);
}