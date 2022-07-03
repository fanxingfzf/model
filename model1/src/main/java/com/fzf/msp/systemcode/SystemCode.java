package com.fzf.msp.systemcode;

/**
 * 返回码
 */
public interface SystemCode {
    //系统通用000000-000100

    /**
     * 系统默认失败返回码
     */
    String SYSTEM_FZF_FAIL="000000";
    /**
     * 系统默认成功返回码
     */
    String SYSTEM_FZF_SUCCESS="000001";

    //添加用户成功000101-000200

    /**
     * 添加用户成功
     */
    String SYSTEM_FZF_ADD_USER_SUCCESS="";


    //添加用户失败000201-000300

    /**
     * 添加用户失败
     */
    String SYSTEM_FZF_ADD_USER_FAIL="";
}
