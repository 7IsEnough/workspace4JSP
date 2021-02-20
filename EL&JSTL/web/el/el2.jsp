<%--
  Created by IntelliJ IDEA.
  User: 97694
  Date: 2020/4/24
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>

    <%
        //在域中存储数据
        session.setAttribute("name","李四");
        request.setAttribute("name","张三");
        session.setAttribute("age","23");

    %>

<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
${name}
</body>
</html>
