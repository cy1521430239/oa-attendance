package com.ccloud.oa.user.mapper;

import com.ccloud.oa.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工表 Mapper 接口
 * </p>
 *
 * @author breeze
 * @since 2020-08-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
