package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.SkuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku图片
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface SkuImagesService extends IService<SkuImages> {

    PageVo queryPage(QueryCondition params);
}

