import com.ivor.DAO;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "TestServlet", urlPatterns = "/posts")
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("posts", DAO.getPosts());
        request.getRequestDispatcher("WEB-INF/posts.jsp").forward(request, response);
    }
}
