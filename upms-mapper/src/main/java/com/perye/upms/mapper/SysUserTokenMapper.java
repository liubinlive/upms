package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.perye.upms.entity.SysUserToken;

/**
 * 系统用户Token Mapper 接口
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysUserTokenMapper extends BaseMapper<SysUserToken> {

    SysUserToken selectByToken(String token);
}