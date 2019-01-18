package com.hpm.blog.service;

import com.hpm.blog.model.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    List<City> findCityByName(String cityName);

    City findById(Long id);

    List<City> findAll();

    public List<City> findCitys(City city);
}
