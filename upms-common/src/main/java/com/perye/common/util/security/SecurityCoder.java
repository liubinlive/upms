package com.perye.common.util.security;

import java.security.Security;

/**
 * 加密基类
 * @Author: Perye
 * @Date: 2019-03-26
 */
public abstract class SecurityCoder {
    private static Byte ADDFLAG = 0;

    static {
        if (ADDFLAG == 0) {
            // 加入BouncyCastleProvider支持
            Security.addProvider(new BouncyCastleProvider());
            ADDFLAG = 1;
        }
    }
}
