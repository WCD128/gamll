package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.CouponHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}

