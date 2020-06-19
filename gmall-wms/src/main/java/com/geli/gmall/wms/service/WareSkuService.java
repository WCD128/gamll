package com.geli.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.wms.entity.WareSku;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author jiangli
 * @since  2020-06-19 17:44:05
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}

