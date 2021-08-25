/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author alex
 */
import javax.swing.*;
import java.sql.*;

public class ConexionBD {
    
    public Connection GetConnection()
    {
            Connection con = null;
            
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String servidor = "jdbc:mysql://localhost:3307/Prueba_UPB";
                String user = "root";
                String psw = "root";
                con = DriverManager.getConnection(servidor,user,psw);
                
                JOptionPane.showMessageDialog(null,"Conexión exitosa!","Conectado",JOptionPane.INFORMATION_MESSAGE);
            }
            
            catch (ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null,ex,"Error 1 "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
                con = null;
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex,"Error 2 "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
                con = null;
            }
            
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex,"Error 3 "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
                con = null;
            }
            
            finally
            {
                return con;
            }
            
    }
}
