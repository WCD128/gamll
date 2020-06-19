package com.geli.gmall.ums.dao;

import com.geli.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author jiangli
 * @since  2020-06-19 17:19:06
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
