package com.laoxing.smallstudy.service;

import com.laoxing.smallstudy.entity.Userlogin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.laoxing.smallstudy.vo.R;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
public interface UserloginService extends IService<Userlogin> {
    R login(String code);
}
