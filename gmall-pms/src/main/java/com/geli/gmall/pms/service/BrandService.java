package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.Brand;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

