package com.yunzhiqu.api.dao;

import com.yunzhiqu.api.modal.ErrorLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErrorLogDao {
    int insert(ErrorLog log) throws Exception;
}
