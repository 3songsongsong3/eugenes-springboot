package com.jojoldu.book.springboot.dao;

import com.jojoldu.book.springboot.domain.user.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
        List<UserVO> getUserList();
}

