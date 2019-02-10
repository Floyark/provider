package com.zzt.provider.mapper.picture;

import org.apache.ibatis.annotations.Mapper;
import pojo.Picture;

import java.util.List;

@Mapper
public interface PicMapper {
    List<Picture> getPicData();
}
