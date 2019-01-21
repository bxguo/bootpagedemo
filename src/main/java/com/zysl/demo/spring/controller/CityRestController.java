package com.zysl.demo.spring.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zysl.demo.spring.model.City;
import com.zysl.demo.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    /**
     * name
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findOneCity(@RequestParam(value = "cityName") String cityName) {
        return cityService.findCityByName(cityName);
    }

    /**
     * 所有
     * @return
     */
    @RequestMapping(value = "/api/all", method = RequestMethod.GET)
    public List<City> findAll() {
        return cityService.findAll();
    }
    /**
     * 分页
     * @return
     */
    @GetMapping("/api/page")
    public PageInfo<City> findPage(@RequestParam(value = "pageNo") int pageNo
            ,@RequestParam(value = "pageSize") int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<City> pageInfo = new PageInfo<>(cityService.findCitys(new City()));
        return pageInfo;
    }

    /**
     * bxguo
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}", method = RequestMethod.GET)
    public City find(@PathVariable(value = "id") Long id) {
        return cityService.findById(id);
    }

}
