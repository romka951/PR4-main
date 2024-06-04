import entity.JavaBean;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("MainServlet")
public class MainServlet extends HttpServlet {

    @EJB
    JavaBean javaBean;

    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("books", javaBean.findAll());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
