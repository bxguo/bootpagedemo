package com.hpm.blog.controller;

import com.hpm.blog.model.City;
import com.hpm.blog.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName") String cityName) {
        return cityService.findCityByName(cityName);
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
