package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.AttrGroup;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性分组
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);
}

