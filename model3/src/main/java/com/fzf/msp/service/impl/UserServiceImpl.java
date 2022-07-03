package com.fzf.msp.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzf.msp.commons.R;
import com.fzf.msp.entity.UserEntity;
import com.fzf.msp.mapper.UserMapper;
import com.fzf.msp.service.UserService;
import com.fzf.msp.systemcode.SystemCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public R findAllUser() {
        return userMapper.findAllUser();
    }

}
