package com.zysl.demo.spring.service;

import com.zysl.demo.spring.model.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 */
public interface CityService extends BaseCityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    List<City> findCityByName(String cityName);

    City findById(Long id);

    List<City> findAll();

    public List<City> findCitys(City city);
}
