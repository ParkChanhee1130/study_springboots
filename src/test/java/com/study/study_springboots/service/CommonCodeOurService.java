package com.study.study_springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.study_springboots.dao.CommonDao;

@Service
public class CommonCodeOurService {
    @Autowired
    CommonDao commonDao;

    public Object getList(Object dataMap){
        String sqlMapId = "CommonCodeOur.selectListByUID";
        Object result = commonDao.getList(sqlMapId, dataMap);
        return result;
    }
}
