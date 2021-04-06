package com.tq.controller;

import com.tq.province;
import com.tq.service.IProvinceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProvinceController {
    @Autowired
    private IProvinceService provinceService;
    @GetMapping("page")
    public  String toPage(String page){
      return page;
    }
    @GetMapping("queryAll")
    public  String queryAll(ModelMap map){
        List<province> provinceList = provinceService.queryAll();
        map.put("provinceList",provinceList);
        return "index";
    }
}
