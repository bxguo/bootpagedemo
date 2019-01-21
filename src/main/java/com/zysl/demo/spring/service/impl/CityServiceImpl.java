package com.zysl.demo.spring.service.impl;

import com.zysl.demo.spring.mapper.CityMapper;
import com.zysl.demo.spring.model.City;
import com.zysl.demo.spring.service.CityService;
import com.zysl.demo.spring.service.base.BaseCityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl extends BaseCityServiceImpl implements CityService {

    @Override
    public List<City> findCityByName(String cityName) {
        City city = new City();
        city.setCityName(cityName);
        return cityMapper.select(city);
    }

    @Override
    public City findById(Long id) {
        return (City) cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<City> findAll() {
        return cityMapper.selectAll();
    }
    @Override
    public List<City> findCitys(City city) {
        //return cityMapper.selectByExample(city);
        return cityMapper.selectAll();
    }

}
