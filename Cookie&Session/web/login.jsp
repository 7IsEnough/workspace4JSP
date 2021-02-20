<%--
  Created by IntelliJ IDEA.
  User: 97694
  Date: 2020/4/21
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login kobe</title>
    <script>
        window.onload = function () {
            document.getElementById("img").onclick = function () {

                this.src = "/Cookie_Session/checkCodeServlet?=time"+new Date().getTime();
            }
            
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>

<body>
    <form action="/Cookie_Session/loginServlet" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>
            <tr>
                <td colspan="2"><img id="img" src="/Cookie_Session/checkCodeServlet"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录"></td>
            </tr>
        </table>

    </form>

    <div>
        <%=request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error")%>
        <%--用EL表达式的写法--%>
        <%--${requestScope.cc_error}--%>
    </div>
    <div>
        <%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%>
    </div>


</body>
</html>
