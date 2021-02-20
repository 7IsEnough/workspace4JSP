<%--
  Created by IntelliJ IDEA.
  User: 97694
  Date: 2020/4/22
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>主题信息</h3>

    <!--
    <h1>hello</h1>
    -->

    <%--
        <%
            System.out.println("Kobe");
        %>
    --%>

    <%--
        <input>
    --%>


    <%
        pageContext.setAttribute("msg","hello");

    %>

    <%=pageContext.getAttribute("msg")%>
</body>
</html>
