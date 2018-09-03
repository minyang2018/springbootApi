package com.yunzhiqu.api.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommonDao {

    //获取用户收藏其他用户名片列表
    public List<Map> getUserSaveList(Map param);
}