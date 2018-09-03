package com.yunzhiqu.api.dao.mapper;

import java.util.List;

import com.yunzhiqu.api.modal.TVersionInfo;
import com.yunzhiqu.api.modal.TVersionInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TVersionInfoMapper {
    long countByExample(TVersionInfoExample example);

    int deleteByExample(TVersionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TVersionInfo record);

    int insertSelective(TVersionInfo record);

    List<TVersionInfo> selectByExample(TVersionInfoExample example);

    TVersionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TVersionInfo record, @Param("example") TVersionInfoExample example);

    int updateByExample(@Param("record") TVersionInfo record, @Param("example") TVersionInfoExample example);

    int updateByPrimaryKeySelective(TVersionInfo record);

    int updateByPrimaryKey(TVersionInfo record);
}