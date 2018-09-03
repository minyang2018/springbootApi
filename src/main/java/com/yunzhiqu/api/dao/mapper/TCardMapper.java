package com.yunzhiqu.api.dao.mapper;

import com.yunzhiqu.api.modal.TCard;
import com.yunzhiqu.api.modal.TCardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TCardMapper {
    long countByExample(TCardExample example);

    int deleteByExample(TCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCard record);

    int insertSelective(TCard record);

    List<TCard> selectByExampleWithBLOBs(TCardExample example);

    List<TCard> selectByExample(TCardExample example);

    TCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCard record, @Param("example") TCardExample example);

    int updateByExampleWithBLOBs(@Param("record") TCard record, @Param("example") TCardExample example);

    int updateByExample(@Param("record") TCard record, @Param("example") TCardExample example);

    int updateByPrimaryKeySelective(TCard record);

    int updateByPrimaryKeyWithBLOBs(TCard record);

    int updateByPrimaryKey(TCard record);
}