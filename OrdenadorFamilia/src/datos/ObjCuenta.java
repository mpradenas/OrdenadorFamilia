package datos;

import java.util.Date;


public class ObjCuenta {
   
    private int ID_CUENTA;
    private String NOMBRE_CUENTA;
    private double MONTO_DEUDA;
    private boolean estado;
    private Date fecha;

    public ObjCuenta() {
    }

    public ObjCuenta(int ID_CUENTA, String NOMBRE_CUENTA, double MONTO_DEUDA, boolean estado, Date fecha) {
        this.ID_CUENTA = ID_CUENTA;
        this.NOMBRE_CUENTA = NOMBRE_CUENTA;
        this.MONTO_DEUDA = MONTO_DEUDA;
        this.estado = estado;
        this.fecha = fecha;
    }
    
    public int getID_CUENTA() {
        return ID_CUENTA;
    }

    public void setID_CUENTA(int ID_CUENTA) {
        this.ID_CUENTA = ID_CUENTA;
    }

    public String getNOMBRE_CUENTA() {
        return NOMBRE_CUENTA;
    }

    public void setNOMBRE_CUENTA(String NOMBRE_CUENTA) {
        this.NOMBRE_CUENTA = NOMBRE_CUENTA;
    }

    public double getMONTO_DEUDA() {
        return MONTO_DEUDA;
    }

    public void setMONTO_DEUDA(double MONTO_DEUDA) {
        this.MONTO_DEUDA = MONTO_DEUDA;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
