package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;



public class Cuentas_usuarios {
    
private String servidor;
private String user;
private String password;


    public Cuentas_usuarios(String servidor, String user, String password) {
       this.servidor=servidor;
       this.user=user;
       this.password=password;
    }

    
    
    public Object getObjeto(int idcuentas_usuarios) throws ClassNotFoundException {
         
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT IDCUENTAUSUARIO,ID_USUARIO,ID_CUENTA FROM ordenadorfamilia.cuentas_usuarios where IDCUENTAUSUARIO="+idcuentas_usuarios;
        ObjCuentas_usuarios oCusuarios= new ObjCuentas_usuarios();
        Usuario proccessUsuario=new Usuario(servidor,user,password);
        Cuentas proccessCuenta= new Cuentas(servidor,user,password);
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
                 oCusuarios.setIDCUENTAUSUARIO(rs.getInt("idCuentausuario"));
                 oCusuarios.setId_Usuario((ObjUsuario) proccessUsuario.getObjeto(rs.getInt("id_usuario")));
                 oCusuarios.setId_cuenta((ObjCuenta) proccessCuenta.getObjeto(rs.getInt("id_cuenta")));
           }
              
        }
        catch(SQLException ex)
        {
             oCusuarios=null;
        } 
        return oCusuarios;
    }
    
      public List<ObjCuentas_usuarios> getListObjeto(int idusuarios) throws ClassNotFoundException {
         
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT IDCUENTAUSUARIO,ID_USUARIO,ID_CUENTA FROM ordenadorfamilia.cuentas_usuarios where ID_usuario="+idusuarios;
        ObjCuentas_usuarios oCusuarios= new ObjCuentas_usuarios();
        
        List<ObjCuentas_usuarios>LaLista=null;
        Usuario proccessUsuario=new Usuario(servidor,user,password);
        Cuentas proccessCuenta= new Cuentas(servidor,user,password);
       
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next())
           {
                 oCusuarios.setIDCUENTAUSUARIO(rs.getInt("idCuentausuario"));
                 oCusuarios.setId_Usuario((ObjUsuario) proccessUsuario.getObjeto(rs.getInt("id_usuario")));
                 oCusuarios.setId_cuenta((ObjCuenta) proccessCuenta.getObjeto(rs.getInt("id_cuenta")));
                 LaLista.add(oCusuarios);
           }
              
        }
        catch(SQLException ex)
        {
             LaLista=null;
        } 
        
        return LaLista;
    }

   
    public boolean setObjeto(ObjCuentas_usuarios laCuentaUsuario) throws ClassNotFoundException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT IDCUENTAUSUARIO,ID_USUARIO,ID_CUENTA FROM ordenadorfamilia.cuentas_usuarios where IDCUENTAUSUARIO="+laCuentaUsuario.getIDCUENTAUSUARIO();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
                sql="UPDATE ordenadorfamilia.cuentas_usuarios SET ID_USUARIO="+laCuentaUsuario.getId_Usuario()+",ID_Cuenta="+laCuentaUsuario.getId_cuenta()+" WHERE IDCUENTAUSUARIO="+laCuentaUsuario.getIDCUENTAUSUARIO();
                
           }
           else
           {
                sql="INSERT INTO ordenadorfamilia.cuentas_usuarios(ID_USUARIO,ID_CUENTA)VALUES("+laCuentaUsuario.getId_Usuario()+","+laCuentaUsuario.getId_cuenta()+")";
           }
           st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
           return false;   
        } 
        return true;
    }

   
    public boolean deleteObjeto(ObjCuentas_usuarios laCuentaUsuario) throws ClassNotFoundException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        String sql="delete FROM ordenadorfamilia.cuentas_usuarios where IDCUENTAUSUARIO="+laCuentaUsuario.getIDCUENTAUSUARIO();
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
