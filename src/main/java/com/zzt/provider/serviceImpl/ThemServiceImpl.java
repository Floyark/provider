package com.zzt.provider.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Themes;
import com.zzt.provider.mapper.theme.ThemeMapper;
import service.ThemeService;

import java.util.List;
import java.util.Map;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = ThemeService.class)
public class ThemServiceImpl implements ThemeService {

    @Autowired
    ThemeMapper themeDao;
    @Override
    public JSONObject getAllTheme(int pageNum,int pageSize) {


        PageHelper.startPage(pageNum, pageSize);//pageNum 页码  pageSize 每页显示条数
        List<Themes> list = themeDao.getAllTheme();
        PageInfo<Themes> pageInfo = new PageInfo<>(list);

        JSONObject jsonObject=new JSONObject();
        //格式化数据，适应table
        //jsonObject.put("themes",list);
        jsonObject.put("pageInfo",pageInfo);
        return jsonObject;
    }

    @Override
    public int insertThemes(Map map) {
        return themeDao.insertThemes(map);
    }

    @Override
    public int deleteThemes() {
        return themeDao.deleteThemes();
    }

    @Override
    public int getTotals() {
        return themeDao.getTotals();
    }


}
