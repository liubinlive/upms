package com.perye.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 公用Controller
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public abstract class BaseController {
    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        /**
         * 自动转换日期类型的字段格式
         */
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH"), true));
    }

    /**
     * redirect跳转
     * @param url 目标url
     * @return
     */
    protected String redirect(String url) {
        return new StringBuilder("redirect:").append(url).toString();
    }
}
