/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cuentas implements crudObjetos{

    private String servidor;
    private String user;
    private String password;

    public Cuentas(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    
    @Override
    public Object getObjeto() {
      basedatos bd = new basedatos(this.servidor,this.user, this.password);
      Connection con=bd.getConnection();
      Statement st;
      ResultSet rs;
      String sql="";
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
           
           }
           
        }
        catch(SQLException ex)
        {
             
        }
        return true;
    }

    @Override
    public boolean setObjeto() {
        basedatos bd;
        bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="";
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
            //aquí hará un update 
           }
           else
           {
              //aquí sólo hará un inserción
               
           }
           
        }
        catch(SQLException ex)
        {
             return false;
        }
        return true;
    }

    @Override
    public boolean deleteObjeto() {
        basedatos bd;
        bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="";
        try
        {
           st=con.createStatement();
           st.executeUpdate(sql);
        }
        catch(SQLException ex)
        { 
             return false;
        }
        return true;
    }
    
}
