package com.perye.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * vue tree 插件的节点
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class TreeNode implements Serializable {

    /**
     * 节点id
     */
    private String id;

    /**
     * 父节点Id
     */
    private String parentId;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 是否打开节点
     */
    private Boolean open;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<?> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public static TreeNode createParent() {
        TreeNode treeNode = new TreeNode();
        treeNode.setId("0");
        treeNode.setName("顶级");
        treeNode.setOpen(true);
        treeNode.setParentId("0");
        return treeNode;
    }
}
