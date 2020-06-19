package com.geli.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.ums.entity.MemberLevel;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员等级
 *
 * @author jiangli
 * @since  2020-06-19 17:19:07
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageVo queryPage(QueryCondition params);
}

