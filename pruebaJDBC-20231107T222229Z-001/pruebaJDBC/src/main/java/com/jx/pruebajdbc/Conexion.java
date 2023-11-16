package com.jx.pruebajdbc;

import java.sql.*;

public class Conexion {


    public static Connection conectar(String url, String dbNombre, String user, String password) throws SQLException {

            try {
                Connection conexion = DriverManager.getConnection("jdbc:myqsl://" + url + "/" + dbNombre, user,password);
                return conexion;
            }catch (SQLException ex){
                ex.printStackTrace(System.out);
                return null;
            }

    }
}