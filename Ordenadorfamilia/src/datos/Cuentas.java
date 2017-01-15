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


public class Cuentas {

    private String servidor;
    private String user;
    private String password;

    public Cuentas(String servidor, String user, String password) {
        this.servidor = servidor;
        this.user = user;
        this.password = password;
    }
    
    
   
    public Object getObjeto(int idCuenta) throws ClassNotFoundException {
        basedatos bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT id_cuenta,nombre_cuenta,montodeuda,estado,fecha FROM ordenadorfamilia.cuentas where id_cuenta="+idCuenta;
        ObjCuenta laCuenta= new ObjCuenta();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
             laCuenta.setID_CUENTA(rs.getInt("id_cuenta"));
             laCuenta.setNOMBRE_CUENTA(rs.getString("nombre_cuenta"));
             laCuenta.setMONTO_DEUDA(rs.getDouble("montodeuda"));
             laCuenta.setEstado(rs.getBoolean("estado"));
           }
        }
        catch(SQLException ex)
        {
             laCuenta=null;
        }
        return laCuenta;
    }

    
    public boolean setObjeto(ObjCuenta laCuenta) throws ClassNotFoundException 
    {
        basedatos bd;
        bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT id_cuenta,nombre_cuenta,montodeuda,estado,fecha FROM ordenadorfamilia.cuentas where id_cuenta="+laCuenta.getID_CUENTA();
        try
        {
           st=con.createStatement();
           rs=st.executeQuery(sql);
           if(rs.next())
           {
               //Cuando la cuenta sea paga, cambiará su estado
               sql="UPDATE ordenadorFamilia.cuentas set estado="+laCuenta+" WHERE id_cuenta="+laCuenta.getID_CUENTA();
               
           }
           else
           {
              //aquí sólo hará un inserción o creaciòn de cuentas a pagar
               sql="INSER INTO ordenadorfamilia.cuentas(nombre_cuenta,montodeuda,estado,fecha)values('"+laCuenta.getNOMBRE_CUENTA()+"','"+laCuenta.getMONTO_DEUDA()+"',"+laCuenta.isEstado()+",'"+laCuenta.getFecha()+"')";
           }
           st.executeUpdate(sql);
           
        }
        catch(SQLException ex)
        {
             return false;
        }
        return true;
    }

    public boolean deleteObjeto(ObjCuenta laCuenta) throws ClassNotFoundException {
        basedatos bd;
        bd = new basedatos(this.servidor,this.user, this.password);
        Connection con=bd.getConnection();
        Statement st;
        ResultSet rs;
        String sql="DELETE FROM Cuentas Where id_cuenta="+laCuenta.getID_CUENTA();
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
