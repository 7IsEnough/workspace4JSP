<%@ page import="domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 97694
  Date: 2020/4/24
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>

    <%
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setBirthday(new Date());

        request.setAttribute("u",user);

        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(user);

        request.setAttribute("list",list);

        Map map = new HashMap();
        map.put("sname","李四");
        map.put("gender","男");
        map.put("user",user);

        request.setAttribute("map",map);



    %>

<h3>el获取对象中的值</h3>
${requestScope.u}<br>

<%--
    通过对象的属性获取对象的值
        属性：setter或getter方法，去掉set或get，再将剩余的部分，首字母变为小写
        setName -> Name -> name
--%>

${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birthday}<br>
${requestScope.u.birthday.year}<br>

${requestScope.u.birStr}<br>

<h3>el获取List值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2].name}<br>

<h3>el获取map值</h3>
${map}<br>
${map.gender}<br>
${map["gender"]}<br>
${map.user.name}<br>


</body>
</html>
