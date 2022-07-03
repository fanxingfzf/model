package com.fzf.msp.resp;

import lombok.Data;

/**
 * 跟前端打交道的
 */
@Data
public class UserResp {
    /**
     * uid
     */
    private int uid;

    /**
     * 用户名字
     */
    private String uname;

    /**
     * 用户账号
     */
    private String uaccount;

    /**
     * 用户密码
     */
    private String upass;

    /**
     * 用户状态 1:禁用 2:正常
     */
    private String ustatus;

    /**
     * 用户性别 1:男 2：女
     */
    private String usex;

    /**
     * 登录次数
     */
    private String ucount;

    /**
     * 起始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;
}
