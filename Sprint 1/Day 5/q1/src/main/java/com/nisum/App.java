package com.nisum;


import com.nisum.util.DBconnection;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection con = DBconnection.getConnection();

    }
}
