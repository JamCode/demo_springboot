package com.wanghan.demo.dao;

import com.wanghan.demo.models.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Mapper
@Component
public interface UserMapper {


    //select *from zk_userinfo where account = 'iDeal_test005'
    @Select("select *from zk_userinfo where account = #{account}")
    User findByName(@Param("account") String account);





}
