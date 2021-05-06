package com.study.service.impl;

import com.study.dao.AreaDao;
import com.study.dao.impl.AreaDaoImpl;
import com.study.entity.Area;
import com.study.service.AreaService;

import java.util.List;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/4 0004 - 05 - 04 - 22:55
 * @version: 1.0
 */
public class AreaServiceImpl implements AreaService {
    private AreaDao areaDao = new AreaDaoImpl();
    @Override
    public List<Area> findByparentID(Integer parentID) {
        List<Area> areas = areaDao.findByparentID(parentID);
        return areas;
    }
}
