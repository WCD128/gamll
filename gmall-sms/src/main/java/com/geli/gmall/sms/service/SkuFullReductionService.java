package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.SkuFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface SkuFullReductionService extends IService<SkuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

