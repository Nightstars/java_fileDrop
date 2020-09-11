package com.christ.filedrop.filecontrol;

import com.christ.filedrop.fileservice.FileServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/fileServlet")
public class FileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        FileServices fileServices=new FileServices();
        List files=fileServices.fileList();
        request.setAttribute("files",files);
        request.setAttribute("ipadd",request.getLocalAddr());
        request.getRequestDispatcher("filelist.jsp").forward(request,response);
    }
}
