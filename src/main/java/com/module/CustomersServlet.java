package com.module;

import com.module.model.Customers;
import com.module.model.CustomersList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "CustomersServlet", urlPatterns = "/list")
public class CustomersServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    PrintWriter writer = response.getWriter();
    CustomersList list = new CustomersList();

    writer.println("<html>");
    writer.println("<fieldset>");
    writer.println("<legend align=center>Danh sach khach hang</legend>");
    writer.println("<table>");

    try {
      for (Customers c : list.getListCustomer()) {
        writer.println("<tr>"
            + "<td>"
            + "<td>" + c.getId() + "</td>"
            + "<td>" + c.getName() + "</td>"
            + "<td>" + c.getBirthday() + "</td>"
            + "<td>" + c.getAddress() + "</td>"
            + "</td>"
            + "</tr>");
      }
    } catch (SQLException e) {
      writer.println("Error: " + e);
    }

    writer.println("</table>");
    writer.println("</fieldset>");
    writer.println("</html>");

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
