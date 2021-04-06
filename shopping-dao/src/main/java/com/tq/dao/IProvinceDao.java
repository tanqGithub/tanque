package com.tq.dao;

import com.tq.province;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface IProvinceDao {
    @Select("select * from province")
    @RequestMapping("provinceMapper")
    public List<province> queryAll();
}
