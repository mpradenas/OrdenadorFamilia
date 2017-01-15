/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.ObjCuenta;
import datos.ObjCuentas_usuarios;
import datos.ObjUsuario;
import java.util.List;

/**
 *
 * @author Gamalyon
 */
public class Cuentas_usuarios {
    
    private String servidor;
    private String user;
    private String password;

    public Cuentas_usuarios(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    public ObjCuentas_usuarios traeCuentaUsuarios(int idUSuario) throws ClassNotFoundException
    {
        datos.Cuentas_usuarios ProccessCuentaUsuario=new datos.Cuentas_usuarios(servidor,user,password);
        return (ObjCuentas_usuarios)ProccessCuentaUsuario.getObjeto(idUSuario);
    }
    
    public List<ObjCuentas_usuarios> traeListCuentasUsuarios(int idUSuario) throws ClassNotFoundException
    {
           datos.Cuentas_usuarios ProccessCuentaUsuario=new datos.Cuentas_usuarios(servidor,user,password);
           return ProccessCuentaUsuario.getListObjeto(idUSuario);
    }
    
    public boolean guardaCuentasUsuarios(int id_cuentaUsuario, int idUsuario, int idCuenta) throws ClassNotFoundException
    {
        datos.Cuentas_usuarios ProccessCuentaUsuario=new datos.Cuentas_usuarios(servidor,user,password);
        datos.Usuario ProccessUsuarios=new datos.Usuario(servidor, user, password);
        datos.Cuentas ProccessCuenta=new datos.Cuentas(servidor, user, password);
        datos.ObjCuentas_usuarios laCuenta_usuario=new datos.ObjCuentas_usuarios();
        laCuenta_usuario=(ObjCuentas_usuarios) ProccessCuentaUsuario.getObjeto(id_cuentaUsuario);
        if(laCuenta_usuario!=null)
        {
           return ModificaCuentasUsuarios(id_cuentaUsuario,idUsuario,idCuenta);
        }
        laCuenta_usuario=new ObjCuentas_usuarios();
        laCuenta_usuario.setId_Usuario((ObjUsuario) ProccessUsuarios.getObjeto(idUsuario));
        laCuenta_usuario.setId_cuenta((ObjCuenta) ProccessCuenta.getObjeto(idCuenta));
        return ProccessCuentaUsuario.setObjeto(laCuenta_usuario);
    }
    
    public boolean ModificaCuentasUsuarios(int id_cuentaUsuario, int idUsuario, int idCuenta) throws ClassNotFoundException
    {
        datos.Cuentas_usuarios ProccessCuentaUsuario=new datos.Cuentas_usuarios(servidor,user,password);
        datos.ObjCuentas_usuarios laCuenta_usuario=new datos.ObjCuentas_usuarios();
        datos.Usuario ProccessUsuarios=new datos.Usuario(servidor, user, password);
        datos.Cuentas ProccessCuenta=new datos.Cuentas(servidor, user, password);
        laCuenta_usuario.setIDCUENTAUSUARIO(id_cuentaUsuario);
        laCuenta_usuario.setId_Usuario((ObjUsuario) ProccessUsuarios.getObjeto(idUsuario));
        laCuenta_usuario.setId_cuenta((ObjCuenta) ProccessCuenta.getObjeto(idCuenta));
        return ProccessCuentaUsuario.setObjeto(laCuenta_usuario);
    }
    
    public boolean EliminaCuentaUsuario(int id_cuentaUsuario) throws ClassNotFoundException
    {
        datos.Cuentas_usuarios ProccessCuentaUsuario=new datos.Cuentas_usuarios(servidor,user,password);
        datos.ObjCuentas_usuarios laCuenta_usuario= new datos.ObjCuentas_usuarios();
        laCuenta_usuario=(ObjCuentas_usuarios) ProccessCuentaUsuario.getObjeto(id_cuentaUsuario);
        return ProccessCuentaUsuario.deleteObjeto(laCuenta_usuario);
    }
}
