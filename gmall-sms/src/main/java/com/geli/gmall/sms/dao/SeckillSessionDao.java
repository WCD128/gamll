package com.geli.gmall.sms.dao;

import com.geli.gmall.sms.entity.SeckillSession;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSession> {
	
}
