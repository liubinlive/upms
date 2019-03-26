package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.upms.entity.SysUserToken;

/**
 * 系统用户Token 服务类
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysUserTokenService extends IService<SysUserToken> {

    SysUserToken selectByToken(String token);
}
