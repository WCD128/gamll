package com.geli.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.wms.entity.WareInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author jiangli
 * @since  2020-06-19 17:44:05
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}

