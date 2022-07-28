package com.jld.jakartademo.servlet;

import com.jld.jakartademo.service.BaseServiceImpl;
import com.jld.jakartademo.service.IBaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/msg.do")
public class BaseServlet extends HttpServlet {

    private IBaseService baseService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String msg = req.getParameter("message");

        baseService = new BaseServiceImpl();
        String replyMsg = null;
        try {
            replyMsg = baseService.replyMessage(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = resp.getWriter();
        printWriter.print(replyMsg);
        printWriter.close();
    }


}
