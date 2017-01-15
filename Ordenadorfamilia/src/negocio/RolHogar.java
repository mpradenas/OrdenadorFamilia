/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.ObjRolHogar;
import java.sql.SQLException;

/**
 *
 * @author Gamalyon
 */
public class RolHogar {
  
    
    private String servidor;
    private String user;
    private String password;

    public RolHogar(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    public ObjRolHogar TraeRolHogar(int id_rol) throws ClassNotFoundException
    {
          datos.RolHogar ProccessRolHogar= new datos.RolHogar(servidor,user,password);
          return (ObjRolHogar)ProccessRolHogar.getObjeto(id_rol);
    }
    
    public boolean GuardaRolHogar(int id_rol,String Descripcion) throws ClassNotFoundException, SQLException
    {
        datos.RolHogar ProccessRolHogar= new datos.RolHogar(servidor,user,password);
        ObjRolHogar elRolHogar=new ObjRolHogar();
        elRolHogar=(ObjRolHogar)ProccessRolHogar.getObjeto(id_rol);
        if(elRolHogar!=null)
        {
            return ModificarRolHogar(id_rol,Descripcion);   
        }
        elRolHogar= new ObjRolHogar();
        elRolHogar.setId_Rol(id_rol);
        elRolHogar.setDescripcion(Descripcion);
        return ProccessRolHogar.setObjeto(elRolHogar);
    }
    
    public boolean ModificarRolHogar(int id_rol,String Descripcion) throws SQLException, ClassNotFoundException
    {
        datos.RolHogar ProccessRolHogar= new datos.RolHogar(servidor,user,password);
        ObjRolHogar elRolHogar=new ObjRolHogar();
        elRolHogar.setId_Rol(id_rol);
        elRolHogar.setDescripcion(Descripcion);
        return ProccessRolHogar.setObjeto(elRolHogar);  
    }
    
    public boolean eliminarRolHogar(int id_rol) throws ClassNotFoundException, SQLException
    {
        datos.RolHogar ProccessRolHogar= new datos.RolHogar(servidor,user,password);
        ObjRolHogar elRolHogar=new ObjRolHogar();
        elRolHogar=(ObjRolHogar)ProccessRolHogar.getObjeto(id_rol);
        return ProccessRolHogar.setObjeto(elRolHogar);
    }
    
    
}
