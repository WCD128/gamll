package com.geli.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.oms.entity.OrderReturnReason;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退货原因
 *
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
public interface OrderReturnReasonService extends IService<OrderReturnReason> {

    PageVo queryPage(QueryCondition params);
}

