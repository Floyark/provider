package com.zzt.provider.serviceImpl;


import com.zzt.provider.mapper.book.BookMapper;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Book;
import service.BookService;

import java.util.List;
import java.util.Map;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = BookService.class)
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> selectBooksByMap(Map map) {
        return bookMapper.selectBooksByMap(map);
    }
}
