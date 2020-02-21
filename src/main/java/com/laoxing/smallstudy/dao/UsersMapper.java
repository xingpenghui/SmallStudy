package com.laoxing.smallstudy.dao;

import com.laoxing.smallstudy.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
public interface UsersMapper extends BaseMapper<Users> {
    int myinsert(Users users);
    int updateSocre(@Param("uid") String uid, @Param("score") int socre);

}
