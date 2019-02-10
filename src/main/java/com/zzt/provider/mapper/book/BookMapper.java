package com.zzt.provider.mapper.book;


import org.apache.ibatis.annotations.Mapper;
import pojo.Book;

import java.util.List;
import java.util.Map;


@Mapper
public interface BookMapper {
    public List<Book> selectBooksByMap(Map map);
}
