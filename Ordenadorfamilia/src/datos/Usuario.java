package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Usuario {

    private String servidor;
    private String user;
    private String password;

    public Usuario(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    public boolean existUsuario(String NickName) throws SQLException, ClassNotFoundException
    {
       basedatos db=new basedatos(this.servidor,this.user,this.password);
       Connection con=db.getConnection();
       Statement st;
       ResultSet rs;
       String sql=" SELECT ID_USUARIO,ID_ROL,NOMBRE_USUARIO,AP_PATERNO,AP_MATERNO,NICK_NAME,PASSWORD FROM ordenadorfamilia.usuario WHERE nick_name='"+NickName+"'";
       st=con.createStatement();
       rs=st.executeQuery(sql);
       if(rs.next())
       {
           rs.close();
           con.close();
           return true;
       }
        rs.close();
        con.close();
        return false;
    }
    
    public Object getObjeto(int idUsuario) throws ClassNotFoundException, SQLException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql=" SELECT ID_USUARIO,ID_ROL,NOMBRE_USUARIO,AP_PATERNO,AP_MATERNO,NICK_NAME,PASSWORD FROM ordenadorfamilia.usuario WHERE id_usuario="+idUsuario;
        ObjUsuario elUsuario= new ObjUsuario();
        RolHogar ProccessRolHogar=new RolHogar(this.servidor,this.user,this.password);
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
              elUsuario.setIdUsuario(rs.getInt("ID_USUARIO"));
              elUsuario.setId_Rol((ObjRolHogar) ProccessRolHogar.getObjeto(rs.getInt("ID_ROL")));
              elUsuario.setNombre_Usuario(rs.getString("NOMBRE_USUARIO"));
              elUsuario.setAp_Paterno(rs.getString("AP_PATERNO"));
              elUsuario.setAp_Materno(rs.getString("AP_MATERNO"));
              elUsuario.setNickName(rs.getString("NICK_NAME"));
              elUsuario.setPassWord(rs.getString("PASSWORD"));
              
           }
           
        }
        catch(SQLException ex)
        {
             elUsuario=null;
        }
        con.close();
        return elUsuario;
    }

    public boolean setObjeto(ObjUsuario elUsuario) throws ClassNotFoundException, SQLException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT ID_USUARIO,ID_ROL,NOMBRE_USUARIO,AP_PATERNO,AP_MATERNO,NICK_NAME,PASSWORD FROM ordenadorfamilia.usuario WHERE id_usuario="+elUsuario.getIdUsuario();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
               sql="Update ordenadorfamilia.usuario set ID_ROL="+elUsuario.getId_Rol()+", NOMBRE_USUARIO='"+elUsuario.getNombre_Usuario()+"',AP_PATERNO='"+elUsuario.getAp_Paterno()+"',AP_MATERNO='"+elUsuario.getAp_Materno()+"',NICK_NAME='"+elUsuario.getNickName()+"',PASSWORD='"+elUsuario.getPassWord()+"' WHERE id_usuario="+elUsuario.getIdUsuario();    
           }
           else
           {
               sql="INSERT INTO ordenadorfamilia.usuario(ID_ROL,NOMBRE_USUARIO,AP_PATERNO,AP_MATERNO,NICK_NAME,PASSWORD)values("+elUsuario.getId_Rol()+",'"+elUsuario.getNombre_Usuario()+"','"+elUsuario.getAp_Paterno()+"','"+elUsuario.getAp_Materno()+"','"+elUsuario.getNickName()+"','"+elUsuario.getPassWord()+")";
           }
           st.executeUpdate(sql);  
        }
        catch(SQLException ex)
        {
            return false;     
        } 
        con.close();
        return true;
    }

    public boolean deleteObjeto(ObjUsuario elUsuario) throws ClassNotFoundException, SQLException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        String sql="delete FROM ordenadorfamilia.usuario WHERE id_usuario="+elUsuario.getIdUsuario();
        try
        {
           st=con.createStatement();
           st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            return false;     
        }
        con.close();
        return true;
    }

    
    
}
