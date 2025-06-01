package com.nisum.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

public class DBconnection {
    private static final String url = "jdbc:mysql://localhost:3306/DAY4";
    private static final String username = "root";
    private static final String password = "123456789";

   public static Connection getConnection(){
       try{
           Connection con =  DriverManager.getConnection(url,username,password);
           System.out.println("Database connection is Successfull:");
           return con;
       }catch (SQLException ex){
           System.err.println("Database connection failed:");
           ex.printStackTrace();
           throw  new RuntimeException("unable to connect",ex);
       }
   }

}
