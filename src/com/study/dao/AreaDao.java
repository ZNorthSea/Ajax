package com.study.dao;

import com.study.entity.Area;

import java.util.List;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/4 0004 - 05 - 04 - 22:55
 * @version: 1.0
 */
public interface AreaDao {
    List<Area> findByparentID(int parentID);
}
