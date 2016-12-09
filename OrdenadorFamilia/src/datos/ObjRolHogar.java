package datos;


public class ObjRolHogar {
    private int id_Rol;
    private String Descripcion;
    
    public ObjRolHogar() {
    
    }

    public ObjRolHogar(int id_Rol, String Descripcion) {
        this.id_Rol = id_Rol;
        this.Descripcion = Descripcion;
    }

    public int getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(int id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
