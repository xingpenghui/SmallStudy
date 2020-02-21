package com.laoxing.smallstudy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laoxing.smallstudy.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
public interface BooksMapper extends BaseMapper<Books> {

    List<Books> all(String name);
    List<Books> queryUid(String uid);
    int queryUidBid(@Param("uid") String uid,@Param("bid") int bid);

}
