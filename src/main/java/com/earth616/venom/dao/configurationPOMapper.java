package com.earth616.venom.dao;

import com.earth616.venom.entity.configurationPO;
import com.earth616.venom.entity.configurationPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface configurationPOMapper {
    int countByExample(configurationPOExample example);

    int deleteByExample(configurationPOExample example);

    int deleteByPrimaryKey(String wanIp);

    int insert(configurationPO record);

    int insertSelective(configurationPO record);

    List<configurationPO> selectByExample(configurationPOExample example);

    configurationPO selectByPrimaryKey(String wanIp);

    int updateByExampleSelective(@Param("record") configurationPO record, @Param("example") configurationPOExample example);

    int updateByExample(@Param("record") configurationPO record, @Param("example") configurationPOExample example);

    int updateByPrimaryKeySelective(configurationPO record);

    int updateByPrimaryKey(configurationPO record);
}