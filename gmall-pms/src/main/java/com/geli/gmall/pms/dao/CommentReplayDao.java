package com.geli.gmall.pms.dao;

import com.geli.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
