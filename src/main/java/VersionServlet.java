import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class VersionServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    InetAddress ip;
    // Establish print writer to formulate response
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    try {
        ip = InetAddress.getLocalHost();
        out.println("server_ip:" + ip.getHostAddress() + "</br>");
      } catch (UnknownHostException e) {
        e.printStackTrace();
    }
    /* TODO: get from mysql tidyup*/
    out.println("app_version:1.0.0</br>");
    out.println("db_version:1.0.0");

  }

}
