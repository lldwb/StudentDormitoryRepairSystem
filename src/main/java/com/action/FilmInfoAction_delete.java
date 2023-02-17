package com.action;

import com.service.FilmService;
import com.service.FilmServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delfilm")
public class FilmInfoAction_delete  extends HttpServlet{

    private FilmService service = new FilmServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filmid_str = request.getParameter("filmid");
        int filmid = Integer.parseInt(filmid_str);

        boolean flag = service.delFilmById(filmid);
        PrintWriter out = response.getWriter();

        if(flag){
            out.print("{\"message\":\"ok\",\"code\":1}");
        }else{
            out.print("{\"message\":\"not ok\",\"code\":0}");
        }
    }
}
