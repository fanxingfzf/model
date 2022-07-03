package com.fzf.msp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzf.msp.commons.R;
import com.fzf.msp.resp.UserResp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper {

     public R findAllUser();
}
