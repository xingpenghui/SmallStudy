package com.laoxing.smallstudy.service.impl;

import com.laoxing.smallstudy.entity.Users;
import com.laoxing.smallstudy.dao.UsersMapper;
import com.laoxing.smallstudy.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
