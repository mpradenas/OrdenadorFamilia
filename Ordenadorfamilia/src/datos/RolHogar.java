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
    private String servidor;
    private String user;
    private String password;

    public RolHogar(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    @Override
    public Object getObjeto(int id_rol) {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT id_rol,descripcion FROM ordenadorfamilia.rolhogar where id_rol="+id_rol;
        ObjRolHogar elRolHogar= new ObjRolHogar();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
                elRolHogar.setId_Rol(rs.getInt("id_rol"));
                elRolHogar.setDescripcion(rs.getString("descripcion")); 
           }
           
        }
        catch(SQLException ex)
        {
             elRolHogar=null;
        }
        return elRolHogar;
    }

    @Override
    public boolean setObjeto(ObjRolHogar elRol) {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT id_rol,descripcion FROM ordenadorfamilia.rolhogar where id_rol="+elRol.getId_Rol();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
                
           }
           else
           {
           
           }
        }
        catch(SQLException ex)
        {
            return true;     
        }
        return true;
     }
    

    @Override
    public boolean deleteObjeto(ObjRolHogar elRol) {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
     
        String sql="DELETE FROM ordenadorfamilia.rolhogar where id_rol="+elRol.getId_Rol();
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
