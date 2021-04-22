<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <link rel="stylesheet" href="static/css/login-page.css">
    </head>
    <body>
        <form method="post" action="api/login" style="margin-top: 20%">
            <div class="box">
                <h1>Login</h1>
                <input type="email" name="username" value="email" onFocus="field_focus(this, 'email');"
                       onblur="field_blur(this, 'email');" class="email" />
                <input type="password" name="password" value="email" onFocus="field_focus(this, 'email');"
                       onblur="field_blur(this, 'email');" class="email" />
                <input type="submit" class="btn" value="Sign In">
                <%
                    Boolean loginFailedStatus = (Boolean) request.getSession().getAttribute("login-failed-status");
                    if(loginFailedStatus == null){
                        loginFailedStatus = false;
                    }
                %>
                <%if(loginFailedStatus) { %>
                <div style="padding: 10px; color: red" >
                    <%= request.getSession().getAttribute("login-status-message")%>
                </div>
                <%}%>
            </div>

        </form>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript"></script>
    </body>
</html>