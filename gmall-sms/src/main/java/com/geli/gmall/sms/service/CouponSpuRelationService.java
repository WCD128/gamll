package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.CouponSpuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

