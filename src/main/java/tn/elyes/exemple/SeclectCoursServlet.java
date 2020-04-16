package tn.elyes.exemple;
import tn.elyes.model.CoursType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectcoursservlet",
        urlPatterns = "/SelectCours"
)

public class SeclectCoursServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String coursType = req.getParameter("Type");

        CoursService coursService = new CoursService();
        CoursType l = CoursType.valueOf(coursType);

        List liquorcours = coursService.getAvailableCours(l);

        req.setAttribute("cours", liquorcours);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
