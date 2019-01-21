package com.zysl.demo.spring.service.base;

import com.zysl.demo.spring.mapper.CityMapper;
import com.zysl.demo.spring.model.City;
import com.zysl.demo.spring.service.BaseCityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: bxguo
 * @time: 2019/1/21 10:24
 */
public class BaseCityServiceImpl implements BaseCityService {
    @Autowired
    protected CityMapper cityMapper;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return cityMapper.deleteByPrimaryKey(o);
    }

    @Override
    public int delete(City city) {
        return cityMapper.delete(city);
    }

    @Override
    public int insert(City city) {
        return cityMapper.insert(city);
    }

    @Override
    public int insertSelective(City city) {
        return cityMapper.insertSelective(city);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return cityMapper.existsWithPrimaryKey(o);
    }

    @Override
    public List<City> selectAll() {
        return cityMapper.selectAll();
    }

    @Override
    public City selectByPrimaryKey(Object o) {
        return cityMapper.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(City city) {
        return cityMapper.selectCount(city);
    }

    @Override
    public List<City> select(City city) {
        return cityMapper.select(city);
    }

    @Override
    public City selectOne(City city) {
        return cityMapper.selectOne(city);
    }

    @Override
    public int updateByPrimaryKey(City city) {
        return cityMapper.updateByPrimaryKey(city);
    }

    @Override
    public int updateByPrimaryKeySelective(City city) {
        return cityMapper.updateByPrimaryKeySelective(city);
    }

    @Override
    public int deleteByCondition(Object o) {
        return cityMapper.deleteByCondition(o);
    }

    @Override
    public List<City> selectByCondition(Object o) {
        return cityMapper.selectByCondition(o);
    }

    @Override
    public int selectCountByCondition(Object o) {
        return cityMapper.selectCountByCondition(o);
    }

    @Override
    public int updateByCondition(City city, Object o) {
        return cityMapper.updateByCondition(city, o);
    }

    @Override
    public int updateByConditionSelective(City city, Object o) {
        return cityMapper.updateByConditionSelective(city, o);
    }

    @Override
    public int deleteByExample(Object o) {
        return cityMapper.deleteByExample(o);
    }

    @Override
    public List<City> selectByExample(Object o) {
        return cityMapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return cityMapper.selectCountByExample(o);
    }

    @Override
    public City selectOneByExample(Object o) {
        return cityMapper.selectOneByExample(o);
    }

    @Override
    public int updateByExample(City city, Object o) {
        return cityMapper.updateByExample(city, o);
    }

    @Override
    public int updateByExampleSelective(City city, Object o) {
        return cityMapper.updateByExampleSelective(city, o);
    }

    @Override
    public int deleteByIds(String s) {
        return cityMapper.deleteByIds(s);
    }

    @Override
    public List<City> selectByIds(String s) {
        return cityMapper.selectByIds(s);
    }

    @Override
    public int insertList(List<City> list) {
        return cityMapper.insertList(list);
    }

    @Override
    public int insertUseGeneratedKeys(City city) {
        return cityMapper.insertUseGeneratedKeys(city);
    }


    /*protected class BaseService<T> implements InvocationHandler {

        Class<T> obj = null;

        private BaseService() {}
        public BaseService(Class<T> obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(this.obj, args);
            return result;
        }
    }*/

}
