package com.geli.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.ums.entity.Member;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员
 *
 * @author jiangli
 * @since  2020-06-19 17:19:06
 */
public interface MemberService extends IService<Member> {

    PageVo queryPage(QueryCondition params);
}

