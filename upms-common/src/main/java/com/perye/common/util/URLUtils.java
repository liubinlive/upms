package com.perye.common.util;

import java.nio.charset.Charset;

import org.springframework.web.util.UriUtils;
/**
 * url处理工具类
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class URLUtils extends UriUtils {

    /**
     * url 编码
     *
     * @param source  url
     * @param charset 字符集
     * @return 编码后的url
     */
    public static String encodeURL(String source, Charset charset) {
        try {
            return URLUtils.encode(source, charset.name());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}

