package com.perye.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * vue 勾选树
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class SelectTreeNode implements Serializable {

    private String id;

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<SelectTreeNode> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SelectTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<SelectTreeNode> children) {
        this.children = children;
    }
}
