package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.model.dto.chart.ChartQueryRequest;
import com.yupi.springbootinit.model.dto.post.PostQueryRequest;
import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.Post;

/**
 *
 */
public interface ChartService extends IService<Chart> {

    QueryWrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest);

}
