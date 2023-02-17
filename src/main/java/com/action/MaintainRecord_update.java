package com.action;

import com.service.MaintainRecordService;
import com.service.MaintainRecordServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/update")
public class MaintainRecord_update extends HttpServlet{

    private MaintainRecordService service = new MaintainRecordServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mid_str = request.getParameter("mid");
        int mid = Integer.parseInt(mid_str);

        boolean flag = service.updMaintainRecordById(mid);
        PrintWriter out = response.getWriter();

        if(flag){
            out.print("{\"message\":\"ok\",\"code\":1}");
        }else{
            out.print("{\"message\":\"not ok\",\"code\":0}");
        }
    }
}
