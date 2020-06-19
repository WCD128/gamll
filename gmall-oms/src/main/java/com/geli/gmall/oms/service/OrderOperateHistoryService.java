package com.geli.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.oms.entity.OrderOperateHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单操作历史记录
 *
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistory> {

    PageVo queryPage(QueryCondition params);
}

