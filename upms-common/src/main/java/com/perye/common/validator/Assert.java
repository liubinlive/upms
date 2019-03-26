package com.perye.common.validator;

import com.perye.common.exception.GlobalException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @Author: Perye
 * @Date: 2019-03-26
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new GlobalException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new GlobalException(message);
        }
    }
}
