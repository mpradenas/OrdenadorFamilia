package datos;

public class ObjCuentas_usuarios {
    private int IDCUENTAUSUARIO;
    private ObjUsuario id_Usuario;
    private ObjCuenta id_cuenta;

    public ObjCuentas_usuarios() {
    }

    public int getIDCUENTAUSUARIO() {
        return IDCUENTAUSUARIO;
    }

    public void setIDCUENTAUSUARIO(int IDCUENTAUSUARIO) {
        this.IDCUENTAUSUARIO = IDCUENTAUSUARIO;
    }

    public ObjUsuario getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(ObjUsuario id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public ObjCuenta getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(ObjCuenta id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    
}
