package com.hpm.blog.mapper;

import com.hpm.blog.model.City;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
    /**
     * 根据主键id，查询城市信息
     *
     * @param id 城市名
     */
    City findById(@Param("id") Long id);
}
