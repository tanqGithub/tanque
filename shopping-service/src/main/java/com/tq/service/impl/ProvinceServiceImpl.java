package com.tq.service.impl;

import com.tq.dao.IProvinceDao;
import com.tq.province;
import com.tq.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements IProvinceService {
    @Autowired
    private IProvinceDao provinceDao;
    public List<province> queryAll(){
       return provinceDao.queryAll();
    }

}
