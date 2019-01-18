package com.hpm.blog.service.impl;

import com.hpm.blog.mapper.CityMapper;
import com.hpm.blog.model.City;
import com.hpm.blog.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @Override
    public City findById(Long id) {
        return cityDao.findById(id);
    }

}
