package com.example.week_7.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/api/login")
public class LoginServlet extends HttpServlet {
    private static String username = "me@gilangprambudi.net";
    private static String password = "root";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //check password
        String givenUsername = request.getParameter("username");
        String givenPassword = request.getParameter("password");
        System.out.println(givenPassword + " " + givenUsername);
        boolean credentialCorrect = checkCredential(givenUsername, givenPassword);
        if(!credentialCorrect){
            HttpSession session = request.getSession();
            session.setAttribute("login-failed-status", true);
            session.setAttribute("login-status-message", "Incorrect credentials");
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return;
        }

        request.getSession().setAttribute("logged-in-username", givenUsername);
        response.sendRedirect(request.getContextPath() + "/home");
    }

    boolean checkCredential(String givenUsername, String givenPassword){
        return givenUsername.equals(username) &&
                givenPassword.equals(password);
    }
}
