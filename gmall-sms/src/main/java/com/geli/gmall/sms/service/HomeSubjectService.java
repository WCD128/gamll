package com.geli.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geli.gmall.sms.entity.HomeSubject;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author jiangli
 * @since  2020-06-19 16:47:06
 */
public interface HomeSubjectService extends IService<HomeSubject> {

    PageVo queryPage(QueryCondition params);
}

