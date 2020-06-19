package com.geli.gmall.pms.dao;

import com.geli.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
