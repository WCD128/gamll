package com.geli.gmall.oms.dao;

import com.geli.gmall.oms.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
	
}
