package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.perye.upms.entity.SysFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 附件表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysFileMapper extends BaseMapper<SysFile> {

    /**
     * 通过tableId和recordId获取相关附件信息
     * @param params
     * @return
     */
    List<SysFile> selectFileListByTableIdAndRecordId(Map<String, Object> params);

    /**
     * 获取附件信息页
     * @param page
     * @param params
     * @return
     */
    IPage<SysFile> selectSysFilePage(Page page, @Param("params") Map<String, Object> params);

}
