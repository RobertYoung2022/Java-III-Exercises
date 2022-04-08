import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/custom-cookie-form")
public class LanguageServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/custom-cookie-form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form data
        String favLang = request.getParameter("language");

        // create the cookie
        Cookie theCoookie = new Cookie("language", favLang);

        // set the life span ... total number of seconds
        theCoookie.setMaxAge(60*60*24*365);

        // send cookie to browser
        response.addCookie(theCoookie);
    }
}
