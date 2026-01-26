package com.yating.xiaolvshu.auth.domain.mapper;

import com.yating.xiaolvshu.auth.domain.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDOMapper {

    /**
     * 根据主键id查询
     * @param id
     * @return
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据主键id删除
     * @parame id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增
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
