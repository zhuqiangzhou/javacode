package com.zqz.controller;

import com.zqz.domain.Area;
import com.zqz.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    /**
     * 查询区域列表
     * @return
     */
    @GetMapping(value = "/area")
    public Map<String,Object> listArea() {
        Map<String,Object> map = new HashMap<String,Object>();
        List<Area> list = areaService.queryArea();
        map.put("areaList",list);
        return map;
    }

    /**
     * 根据id查询
     * @param areaId
     * @return
     */
    @GetMapping(value = "/getaerabyid")
    public Map<String,Object> getAreaId(Integer areaId) {
        Map<String,Object> map = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        map.put("area",area);
        return  map;
    }

    /**
     * 新增
     * @param area
     * @return
     */
    @GetMapping(value = "/addarea")
    public Map<String,Object> addArea(Area area) {
        Map<String,Object> map = new HashMap<>();
        map.put("success",areaService.addArea(area));
        return map;
    }

    /**
     * 修改
     * @param area
     * @return
     */
    @GetMapping(value = "/modify")
    public Map<String,Object> modifyArea(Area area){
        Map<String,Object> map = new HashMap<>();
        map.put("success",areaService.modifyArea(area));
        return map;
    }

    /**
     * 删除
     * @param areaId
     * @return
     */
    @GetMapping(value = "/remove")
    public Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> map = new HashMap<>();
        map.put("success",areaService.deleteArea(areaId));
        return map;
    }
}
