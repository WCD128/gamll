package com.geli.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.oms.entity.OrderReturnApply;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单退货申请
 *
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageVo queryPage(QueryCondition params);
}

