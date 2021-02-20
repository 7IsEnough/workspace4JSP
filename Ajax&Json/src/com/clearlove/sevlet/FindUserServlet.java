package com.clearlove.sevlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author promise
 * @date 2020/9/30 - 1:37
 */
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取用户名
        String username = request.getParameter("username");

        //2.调用service层判断用户名是否存在
        //设置响应的数据格式为json
        response.setContentType("application/json;charset=utf-8");
        Map<String , Object> map = new HashMap<>();
        if("tom".equals(username)){
            //用户名存在
            map.put("userExist",true);
            map.put("msg","此用户名太受欢迎，请更换一个");
        }else {
            //不存在
            map.put("userExist",false);
            map.put("msg","此用户名可用");
        }

        //将map转为json，并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
