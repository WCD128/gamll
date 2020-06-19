package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.SpuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

