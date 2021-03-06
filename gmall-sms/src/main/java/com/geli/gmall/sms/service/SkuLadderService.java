package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.SkuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageVo queryPage(QueryCondition params);
}

