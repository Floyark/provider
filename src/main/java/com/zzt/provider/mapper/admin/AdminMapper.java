package com.zzt.provider.mapper.admin;



import org.apache.ibatis.annotations.Mapper;
import pojo.Admin;

import java.util.Map;

@Mapper
public interface AdminMapper {

    public Admin getAdmin(Map map);
    public int updateAdmin(int id);
}
