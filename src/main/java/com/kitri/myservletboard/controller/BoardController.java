package com.kitri.myservletboard.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getPathInfo();

        // 1. /list
        // 2. /createForm
        // 3. /create
        // 4. /updateForm
        // 5. /update
        // 6. /delete
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>들어옴!</h1>");

        String view = "/view/board/";

        // 찾아보기
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length());
        System.out.println("command = " + command);

        if (command.equals("/board/list")) {
            view += "boardList.html";
        } else if (command.equals("/board/createForm")) {
            view += "boardCreateForm.html";
        } else if (command.equals("/board/create")) {
            // 1. 폼으로부터 데이터를 받아온다.
            // 2. 받은 데이터를 서버 저장소에 저장한다.
            // 3. 저장이 성공하면 성공 메시지와 함께 게시판 리스트 페이지로 포와딩/리다이렉트 한다.
        } else if (command.equals("/board/updateForm")) {
            view += "boardUpdateForm.html";
        } else if (command.equals("/board/update")) {

        } else if (command.equals("/board/delete")) {

        } else {
            view += "boardList.html";
        }

        if (command.equals("/board/webinf")) {
            view = "/WEB-INF/views/webinf.html";
        }

        // 1. 리다이렉트 전달
//        response.sendRedirect(view);

        // 2. 포워드 전달
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
    }
}
