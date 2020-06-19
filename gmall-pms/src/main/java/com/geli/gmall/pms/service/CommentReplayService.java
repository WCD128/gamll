package com.geli.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.pms.entity.CommentReplay;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价回复关系
 *
 * @author jiangli
 * @since  2020-06-19 15:19:43
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

