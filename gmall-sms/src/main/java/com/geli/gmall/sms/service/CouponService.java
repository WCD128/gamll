package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.Coupon;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券信息
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface CouponService extends IService<Coupon> {

    PageVo queryPage(QueryCondition params);
}

