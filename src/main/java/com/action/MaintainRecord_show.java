package com.action;

import com.entity.MaintainRecord;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.MaintainRecordService;
import com.service.MaintainRecordServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/show")
public class MaintainRecord_show extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //1.获得客户端参数
        String id = request.getParameter("id");
        //2.呼叫service来处理更加复杂的业务逻辑
        MaintainRecordService service = new MaintainRecordServiceImpl();
        List<MaintainRecord> filmList = service.getAllMaintainRecordInfo();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(filmList);
        //3.展示结果
        PrintWriter out = response.getWriter();
        out.print( json );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
