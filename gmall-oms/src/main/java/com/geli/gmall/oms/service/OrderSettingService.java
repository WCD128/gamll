package com.geli.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.oms.entity.OrderSetting;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单配置信息
 *
 * @author jiangli
 * @since  2020-06-19 16:25:20
 */
public interface OrderSettingService extends IService<OrderSetting> {

    PageVo queryPage(QueryCondition params);
}

