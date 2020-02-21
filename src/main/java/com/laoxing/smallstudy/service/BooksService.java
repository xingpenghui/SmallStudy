package com.laoxing.smallstudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laoxing.smallstudy.entity.Books;
import com.laoxing.smallstudy.vo.R;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
public interface BooksService extends IService<Books> {
    R queryList(String name);
    R queryByUid(String uid);
    R checkBook(String uid,int bid);
}
