package com.geli.gmall.wms.dao;

import com.geli.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * @author jiangli
 * @since  2020-06-19 17:44:05
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
