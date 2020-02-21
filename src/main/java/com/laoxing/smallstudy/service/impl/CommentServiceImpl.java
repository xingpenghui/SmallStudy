package com.laoxing.smallstudy.service.impl;

import com.laoxing.smallstudy.entity.Comment;
import com.laoxing.smallstudy.dao.CommentMapper;
import com.laoxing.smallstudy.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
