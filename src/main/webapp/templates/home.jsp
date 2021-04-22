<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: gilangprambudi
  Date: 22/04/21
  Time: 08.13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
    <%
        //create current time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String currentTime = dtf.format(now);
    %>
    <div style="padding: 30px;">
        <div style="box-shadow: 1px 2px 8px #999; padding: 40px;">
            <h3>Hello <%=request.getSession().getAttribute("logged-in-username")%></h3>
            <h5>Welcome to Crypto Market Watch</h5>
            <h5>
                You are logged in at <%=currentTime%>
            </h5>
            <div style="height: 40px;"></div>
            <a href="logout" class="btn btn-danger">
                Logout
            </a>
        </div>
    </div>
</body>
</html>
