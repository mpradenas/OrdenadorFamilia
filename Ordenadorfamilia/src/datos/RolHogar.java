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

/**
 *
 * @author Gamalyon
 */
public class RolHogar implements crudObjetos{

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
    }

    @Override
    public boolean setObjeto() {
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
     }

    @Override
    public boolean deleteObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
   
    
}
