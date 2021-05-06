package com.study.controller;

import com.google.gson.Gson;
import com.study.dao.AreaDao;
import com.study.dao.impl.AreaDaoImpl;
import com.study.entity.Area;
import com.study.service.AreaService;
import com.study.service.impl.AreaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/4 0004 - 05 - 04 - 23:03
 * @version: 1.0
 */
@WebServlet(urlPatterns = "/areacontroller.do")
public class AreaController extends HttpServlet {
    private AreaService areaService = new AreaServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer parentID = 0;
        try {
            parentID = Integer.parseInt(req.getParameter("parentid"));
        } catch (NumberFormatException e) {
        }
        List<Area> areas = areaService.findByparentID(parentID);
        String json = new Gson().toJson(areas);
        System.out.println("json = " + json);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print(json);
    }
}
