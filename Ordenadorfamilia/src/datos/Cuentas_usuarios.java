package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Cuentas_usuarios implements crudObjetos{
    
private String servidor;
private String user;
private String password;


    public Cuentas_usuarios(String servidor, String user, String password) {
       this.servidor=servidor;
       this.user=user;
       this.password=password;
    }

    
    @Override
    public Object getObjeto(int idcuentas_usuarios) throws ClassNotFoundException {
         
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="";
        ObjCuentas_usuarios oCusuarios= new ObjCuentas_usuarios();
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
             oCusuarios=null;
        } 
        
        return oCusuarios;
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
           return false;   
        } 
        return true;
    }

    @Override
    public boolean deleteObjeto() {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        String sql="";
        try
        {
           st=con.createStatement();
           st.executeLargeUpdate(sql);
        }
        catch(SQLException ex)
        {
           return false;   
        } 
        return true;
    }
    
}
