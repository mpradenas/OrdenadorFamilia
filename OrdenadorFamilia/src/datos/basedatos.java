/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class basedatos {
    
    private static String servidor="";
    private static String user="";
    private static String Pass="";
    private static String Driver="com.mysql.jdbc.Driver";
    private static Connection con;
    public basedatos(String servidor, String user, String Pass)
    {
       this.servidor=servidor;
       this.user=user;
       this.Pass=Pass;
    }
    
    public void open() throws ClassNotFoundException
    {
          try
          {
              Class.forName(Driver);
              con=DriverManager.getConnection(servidor,user,Pass);
          }
          catch (SQLException ex)
          {
               System.out.println("Ha ocurrido un error al tratar de conectarse a la base de datos:"+ex.getMessage());
          }       
    }
    
    
    
    
    
    
    
    
    
}
