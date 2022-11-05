package com.jojoldu.book.springboot.service.test;

import com.jojoldu.book.springboot.dao.UserMapper;
import com.jojoldu.book.springboot.domain.user.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    @Override
    public List<UserVO> getUserList() {
        return userMapper.getUserList();
    }
}
