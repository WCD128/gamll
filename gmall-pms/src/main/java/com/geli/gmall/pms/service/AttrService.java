package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.Attr;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}

