package com.fzf.msp.commons;

import com.fzf.msp.systemcode.SystemCode;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 通用返回类
 * @param <T>
 */
@Data
@AllArgsConstructor
public class R<T> {
    /**
     *当前相应的状态码
     */
    private String resultCode;

    /**
     *当前相应的信息
     */
    private String resultMsg;

    /**
     *具体的结果
     */
    private T result;

    /**
     * 系统通用的成功返回
     * @return
     */
    public static R success(){
        return new R(SystemCode.SYSTEM_FZF_SUCCESS,null,null);
    }

    public static R success(String msg){
        return new R(SystemCode.SYSTEM_FZF_SUCCESS,msg,null);
    }

    public R success(T t){
        return new R(SystemCode.SYSTEM_FZF_SUCCESS,null,t);
    }

    public static R success(String code,String msg){
        return new R(code,msg,null);
    }

    /**
     * 系统默认的失败返回
     * @return
     */
    public static R fail(){
        return new R(SystemCode.SYSTEM_FZF_FAIL,null,null);
    }
}
