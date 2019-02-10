package com.zzt.provider.mapper.theme;

import org.apache.ibatis.annotations.Mapper;
import pojo.Themes;

import java.util.List;
import java.util.Map;

@Mapper
public interface ThemeMapper {
    public List<Themes> getAllTheme();
    public int insertThemes(Map map);

    public int deleteThemes();

    int getTotals();
}
