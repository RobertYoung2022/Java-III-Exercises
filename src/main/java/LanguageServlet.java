import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LanguageServlet {
    @WebServlet("/products/create")
    public class CreateProductServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/products/create.jsp").forward(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Products productsDao = DaoFactory.getProductsDao();
            // create a new product based on the submitted data
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            Product product = new Product(name, price);
            // persist the new product
            productsDao.insert(product);
            response.sendRedirect("/products");
        }
    }
    // read form data
    String favLang = request.getParameter("language");

    // create the cookie
    Cookie theCoookie = new Cookie("language", favLang);

    // set the life span ... total number of seconds
    theCoookie.setMaxAge(60*60*24*365);

    // send cookie to browser
    response.addCookie(theCoookie);
}
