package request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author promise
 * @date 2020/3/31 - 17:43
 */
@WebServlet("/requestDemo8")
public class RequsetDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("demo88888被访问了。。");

        //存储数据到request域中
        request.setAttribute("msg","hello");



        //转发到demo9资源
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
//        requestDispatcher.forward(request,response);
        request.getRequestDispatcher("/requestDemo9").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);


    }
}
