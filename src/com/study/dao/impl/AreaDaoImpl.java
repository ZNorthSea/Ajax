package com.study.dao.impl;

import com.study.dao.AreaDao;
import com.study.dao.BaseDao;
import com.study.entity.Area;

import java.util.List;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/4 0004 - 05 - 04 - 22:55
 * @version: 1.0
 */
public class AreaDaoImpl extends BaseDao implements AreaDao {

    @Override
    public List<Area> findByparentID(int parentID) {
        String sql = "select * from area where parentID=?";
        return baseQuery(Area.class, sql, parentID);
    }
}
