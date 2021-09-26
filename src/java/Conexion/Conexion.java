/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Alfredo
 */
public class Conexion {
    private String USERNAME ="root";
    private String PASSWORD ="";
    private String HOST ="localhost";
    private String PORT ="3306";
    private String DATABASE ="dbprueba";
    private String CLASSNAME ="com.mysql.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection conexion;
    
    
    public Conexion(){
        
        try {
            Class.forName(CLASSNAME);
            conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("**********Conexion MySql Exitosa*********");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR"+e);
        } catch  (SQLException e){
            System.err.println("Error"+e);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
                   
            
        }
    }

