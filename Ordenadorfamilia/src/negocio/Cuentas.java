/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.ObjCuenta;
import java.util.Date;

/**
 *
 * @author Gamalyon
 */
public class Cuentas {

    private String servidor;
    private String user;
    private String password;

    public Cuentas(String servidor, String user, String password) {
        
        this.servidor=servidor;
        this.user=user;
        this.password=password;
    }
    
    public ObjCuenta TraeCuenta(int id_cuenta) throws ClassNotFoundException
    {
        datos.Cuentas proccessCuentas= new datos.Cuentas(servidor, user, password);
        datos.ObjCuenta laCuenta= new datos.ObjCuenta();
        return laCuenta=(ObjCuenta)proccessCuentas.getObjeto(id_cuenta);
    }
    
    
    public boolean GuardarCuenta(int id_cuenta,String nombre_cuenta,double montodeuda,boolean estado, Date fecha) throws ClassNotFoundException
    {
        datos.Cuentas proccessCuentas= new datos.Cuentas(servidor, user, password);
        datos.ObjCuenta laCuenta= new datos.ObjCuenta();
        laCuenta=(ObjCuenta) proccessCuentas.getObjeto(id_cuenta);
        if(laCuenta!=null)
        {
            return ModificaCuenta(id_cuenta,nombre_cuenta,montodeuda,estado,fecha);     
        }
        laCuenta= new ObjCuenta();
        laCuenta.setNOMBRE_CUENTA(nombre_cuenta);
        laCuenta.setMONTO_DEUDA(montodeuda);
        laCuenta.setEstado(estado);
        laCuenta.setFecha(fecha);
        return proccessCuentas.setObjeto(laCuenta);
    }
    
    
    //
    public boolean ModificaCuenta(int id_cuenta,String nombre_cuenta,double montodeuda,boolean estado, Date fecha) throws ClassNotFoundException
    {
        datos.Cuentas proccessCuentas= new datos.Cuentas(servidor, user, password);
        datos.ObjCuenta laCuenta= new datos.ObjCuenta();
        laCuenta= new ObjCuenta();
        laCuenta.setID_CUENTA(id_cuenta);
        laCuenta.setNOMBRE_CUENTA(nombre_cuenta);
        laCuenta.setMONTO_DEUDA(montodeuda);
        laCuenta.setEstado(estado);
        laCuenta.setFecha(fecha);
        return proccessCuentas.setObjeto(laCuenta);
    }
    
    public boolean eliminaCuenta(int id_cuenta) throws ClassNotFoundException
    {
        datos.Cuentas proccessCuentas= new datos.Cuentas(servidor, user, password);
        datos.ObjCuenta laCuenta= new datos.ObjCuenta();
        laCuenta=(ObjCuenta)proccessCuentas.getObjeto(id_cuenta);
        return proccessCuentas.deleteObjeto(laCuenta);
    }
    
}
