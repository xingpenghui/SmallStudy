package com.laoxing.smallstudy.service.impl;

import com.laoxing.smallstudy.entity.Orders;
import com.laoxing.smallstudy.dao.OrdersMapper;
import com.laoxing.smallstudy.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
