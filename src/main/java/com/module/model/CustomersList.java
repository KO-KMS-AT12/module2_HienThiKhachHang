package com.module.model;

import com.module.connect.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomersList {

  public ArrayList<Customers> getListCustomer() throws SQLException {
    Connection connection = DBConnect.getConnecttion();

    String sql = "select * from Customers";

    PreparedStatement ps = connection.prepareCall(sql);
    ResultSet rs = ps.executeQuery();

    ArrayList<Customers> list = new ArrayList<>();

    while (rs.next()) {
      Customers customers = new Customers();
      customers.setId(rs.getInt("id"));
      customers.setName(rs.getString("name"));
      customers.setBirthday(rs.getString("birthday"));
      customers.setAddress(rs.getString("address"));
      customers.setImage(rs.getInt("image"));
      list.add(customers);
    }

    return list;

  }

}
