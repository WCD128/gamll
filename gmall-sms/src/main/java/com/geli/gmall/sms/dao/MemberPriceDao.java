package com.geli.gmall.sms.dao;

import com.geli.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
