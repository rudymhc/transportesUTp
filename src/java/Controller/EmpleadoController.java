/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LuisRomero
 */
public class EmpleadoController extends Conexion {

    public boolean login(String username, String password) 
    {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try 
        {
            //String login = "select * from empleado where username = ? and password = ?";
            String login ="{call sp_login(?, ?)}";
            pst = getConexion().prepareStatement(login);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.absolute(1)) 
            {
                return true;
            }

        } 
        catch (Exception e) 
        {
            System.err.println("Error" + e);
        } finally 
        {
            try 
            {
                if (getConexion() != null) 
                {
                    getConexion().close();
                }
                if (pst != null) 
                {
                    pst.close();
                }
                if (rs != null) 
                {
                    rs.close();
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error" + e);
            }

        }
        return false;

    }
    
    
    
   

}
