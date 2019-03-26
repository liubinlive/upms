package com.perye.upms.ueditor.define;

/**
 * 处理状态接口
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface State {

    public boolean isSuccess();

    public void putInfo(String name, String val);

    public void putInfo(String name, long val);

    public String toJSONString();

}

