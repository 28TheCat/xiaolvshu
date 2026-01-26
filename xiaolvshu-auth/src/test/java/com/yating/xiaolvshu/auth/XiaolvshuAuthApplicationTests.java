package com.yating.xiaolvshu.auth;

import com.yating.framework.common.util.JsonUtils;
import com.yating.xiaolvshu.auth.domain.dataobject.UserDO;
import com.yating.xiaolvshu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class XiaolvshuAuthApplicationTests {
    @Resource
    private UserDOMapper userDOMapper;
    @Test
    void contextLoads() {
    }

    /**
     * 测试数据库连接
     */
    @Test
    void testInsert(){
        UserDO userDO = UserDO.builder()
                .id(1L)
                .username("yating")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        userDOMapper.insert(userDO);
    }

    /**
     * 查询数据
     */
    @Test
    void testSelect() {
        // 查询主键 ID 为 1 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }

    /**
     * 删除数据
     */
    @Test
    void testDelete() {
        // 删除主键 ID 为 1 的记录
        userDOMapper.deleteByPrimaryKey(1L);
    }

}
