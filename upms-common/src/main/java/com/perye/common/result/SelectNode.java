package com.perye.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.perye.common.util.JacksonUtils;

import java.io.Serializable;
import java.util.List;

/**
 * vue select 插件的节点
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class SelectNode implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * value
     */
    private String value;

    /**
     * label
     */
    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<SelectNode> options;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SelectNode> getOptions() {
        return options;
    }

    public void setOptions(List<SelectNode> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return JacksonUtils.toJson(this);
    }
}

