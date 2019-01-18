package com.hpm.blog.service.impl;

import com.github.pagehelper.Page;
import com.hpm.blog.mapper.CityMapper;
import com.hpm.blog.model.City;
import com.hpm.blog.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;


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
