package com.geli.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.wms.entity.FeightTemplate;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author jiangli
 * @since  2020-06-19 17:44:05
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

