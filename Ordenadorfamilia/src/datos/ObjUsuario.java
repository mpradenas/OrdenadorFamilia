
package datos;


public class ObjUsuario {

    public ObjUsuario() {
    
    }

    
    public ObjUsuario(int idUsuario, ObjRolHogar Id_Rol, String Nombre_Usuario, String Ap_Paterno, String Ap_Materno, String NickName, String PassWord) {
        this.idUsuario = idUsuario;
        this.Id_Rol = Id_Rol;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Ap_Paterno = Ap_Paterno;
        this.Ap_Materno = Ap_Materno;
        this.NickName = NickName;
        this.PassWord = PassWord;
    }
    
    private int idUsuario;
    private ObjRolHogar Id_Rol;
    private String Nombre_Usuario;
    private String Ap_Paterno;
    private String Ap_Materno;
    private String NickName;
    private String PassWord;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ObjRolHogar getId_Rol() {
        return Id_Rol;
    }

    public void setId_Rol(ObjRolHogar Id_Rol) {
        this.Id_Rol = Id_Rol;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getAp_Paterno() {
        return Ap_Paterno;
    }

    public void setAp_Paterno(String Ap_Paterno) {
        this.Ap_Paterno = Ap_Paterno;
    }

    public String getAp_Materno() {
        return Ap_Materno;
    }

    public void setAp_Materno(String Ap_Materno) {
        this.Ap_Materno = Ap_Materno;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    
    
}
