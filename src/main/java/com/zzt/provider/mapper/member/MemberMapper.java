package com.zzt.provider.mapper.member;

import pojo.Member;

import java.util.List;
import java.util.Map;

public interface MemberMapper {

    public List<Member> selectMembersByMap(Map map);
    public List<Member> selectMembersByNick(String str);

}
