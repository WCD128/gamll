package com.geli.gmall.sms.dao;

import com.geli.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
