import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

@WebServlet("/authors")
public class AuthorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try { // 1. STEP - set a connection obj from Java to MySQL
            DriverManager.registerDriver(new Driver()); // ROAD = connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
            // 2. Statement obj to execute queries to database
            Statement statement = connection.createStatement(); // CAR = car on the connection


            // From here on the statement obj has a later number of methods to send and work with our database

            ResultSet rs = statement.executeQuery("SELECT * FROM author_quote;"); //

            ArrayList<String> quoteList = new ArrayList<String>(); // ArrayList to store String datatypes

            while(rs.next()) {
                quoteList.add(rs.getString("author") + " | "  + rs.getString("content"));
        }
            request.setAttribute("quoteListView", quoteList);
        request.getRequestDispatcher("/WEB-INF/authorQuotes.jsp").forward(request, response);

        } catch(SQLException e) {
            e.printStackTrace(); // print out SQL exception error
            System.out.println("ErrorCode = " + e.getErrorCode());
        } catch (ServletException | IOException e) {
            e.printStackTrace(); // print out Servlet and IO exception error
        }
    }
}
