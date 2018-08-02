package com.zqz.service;

import com.zqz.domain.Area;

import java.util.List;

public interface AreaService {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据Id列出区域列表
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 根据id删除区域
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
