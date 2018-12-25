package com.earth616.venom.dao;

import com.earth616.venom.entity.incidencePO;
import com.earth616.venom.entity.incidencePOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface incidencePOMapper {
    int countByExample(incidencePOExample example);

    int deleteByExample(incidencePOExample example);

    int insert(incidencePO record);

    int insertSelective(incidencePO record);

    List<incidencePO> selectByExample(incidencePOExample example);

    int updateByExampleSelective(@Param("record") incidencePO record, @Param("example") incidencePOExample example);

    int updateByExample(@Param("record") incidencePO record, @Param("example") incidencePOExample example);
}