import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        response.getOutputStream().write(("Id is " + id + "").getBytes());
    }
}
