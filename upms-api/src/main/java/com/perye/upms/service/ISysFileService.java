package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.PageUtils;
import com.perye.upms.entity.SysFile;

import java.util.List;
import java.util.Map;

/**
 * 附件表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysFileService extends IService<SysFile> {

    /**
     * 通过tableId和recordId获取相关附件信息
     *
     * @param params
     * @return
     */
    List<SysFile> selectFileListByTableIdAndRecordId(Map<String, Object> params);

    /**
     * 获取附件信息页
     *
     * @param params
     * @return
     */
    PageUtils<SysFile> selectSysFilePage(Map<String, Object> params);


}
