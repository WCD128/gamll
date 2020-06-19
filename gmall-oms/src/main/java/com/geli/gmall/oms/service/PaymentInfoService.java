package com.geli.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.oms.entity.PaymentInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageVo queryPage(QueryCondition params);
}

