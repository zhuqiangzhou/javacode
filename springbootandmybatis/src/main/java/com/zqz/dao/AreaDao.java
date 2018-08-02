package com.zqz.dao;

import com.zqz.domain.Area;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AreaDao {
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
    Area queryAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据id删除区域
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
