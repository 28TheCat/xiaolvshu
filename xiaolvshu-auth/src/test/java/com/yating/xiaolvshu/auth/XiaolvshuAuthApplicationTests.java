package com.yating.xiaolvshu.auth;

import com.yating.framework.common.util.JsonUtils;
import com.yating.xiaolvshu.auth.domain.dataobject.UserDO;
import com.yating.xiaolvshu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
@Slf4j
class XiaolvshuAuthApplicationTests {

    @Resource
    private UserDOMapper userDOMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsert(){

        UserDO userDO = new UserDO();
        userDO.setNickname("fdsfffds");
        userDO.setCreateTime(new Date());
        userDO.setUpdateTime(new Date());

        userDOMapper.insert(userDO);
    }


    /**
     * 查询数据
     */
    @Test
    void testSelect() {
        // 查询主键 ID 为 4 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }

}
