package com.geli.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.ums.entity.MemberReceiveAddress;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收货地址
 *
 * @author jiangli
 * @since  2020-06-19 17:19:07
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageVo queryPage(QueryCondition params);
}

