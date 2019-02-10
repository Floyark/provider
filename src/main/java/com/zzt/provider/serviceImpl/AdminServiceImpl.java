package com.zzt.provider.serviceImpl;

import com.zzt.provider.mapper.admin.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
import service.AdminService;

import java.util.HashMap;
import java.util.Map;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdmin(String username, String password) {
        Map<String,String> map=new HashMap();
        map.put("username","'"+username+"'");
        map.put("password","'"+password+"'");
        return adminMapper.getAdmin(map);
    }

    @Override
    public int updateAdmin(int id) {
        return 0;
    }
}
