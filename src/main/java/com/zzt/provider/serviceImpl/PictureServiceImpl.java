package com.zzt.provider.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzt.provider.mapper.picture.PicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Picture;
import service.PictureService;


import java.util.List;
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = PictureService.class)
public class PictureServiceImpl implements PictureService {

    @Autowired
    PicMapper picMapper;
    @Override
    public JSONObject getPicData() {
        PageHelper.startPage(1, 100);//pageNum 页码  pageSize 每页显示条数
        List<Picture> list = picMapper.getPicData();
        PageInfo<Picture> pageInfo = new PageInfo<>(list);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("pageInfo",pageInfo);
        return jsonObject;
    }
}
