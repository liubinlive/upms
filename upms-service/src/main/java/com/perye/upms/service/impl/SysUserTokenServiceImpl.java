package com.perye.upms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.upms.entity.SysUserToken;
import com.perye.upms.mapper.SysUserTokenMapper;
import com.perye.upms.service.ISysUserTokenService;

/**
 * 系统用户Token 服务实现类
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenMapper, SysUserToken> implements ISysUserTokenService {

    @Override
    public SysUserToken selectByToken(String token) {
        return this.baseMapper.selectByToken(token);
    }
}
