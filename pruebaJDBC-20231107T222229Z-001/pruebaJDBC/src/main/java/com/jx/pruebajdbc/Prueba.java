/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jx.pruebajdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true
 * @author Juan Cruz
 */
public class Prueba {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/prueba";
        
        
         
           
        

            Connection conec = Conexion.conectar("localhost:3306","contactos", "root","");
            PreparedStatement st = null;
            Contacto con1 = null;
            ResultSet rs = null;

            List<Contacto> lista = new ArrayList<>();

            try{

                st = conec.prepareStatement("SELECT * FROM contactos");

                st.executeQuery();

                while(rs.next()){
            
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("Apelldio: " + rs.getString("Apellido"));
                System.out.println("InstagraM: " + rs.getString("Instagram"));
                System.out.println("Numero: " + rs.getString("Numero") + "\n");

                
            
            
            }
            rs.close();
            st.close();
            conec.close();
            
            
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }

        
    }
}
