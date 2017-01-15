package negocio;

import datos.ObjRolHogar;
import datos.ObjUsuario;
import datos.Usuario;


public class usuario {

     private String servidor;
     private String user;
     private String password;
     public usuario(String servidor,String user, String password) {
         this.servidor=servidor;
         this.user=user;
         this.password=password;
     }
     public ObjUsuario TraeUsuario(int idusuario) throws ClassNotFoundException
     {
         ObjUsuario elUsuario= new ObjUsuario();
         Usuario ProccessUsuario=new Usuario(servidor,user,password);
         return elUsuario=(ObjUsuario)ProccessUsuario.getObjeto(idusuario);
     }
     
     public boolean guardaUsuario(int idUsuario, ObjRolHogar Id_Rol, String Nombre_Usuario, String Ap_Paterno, String Ap_Materno, String NickName, String PassWord) throws ClassNotFoundException
     {
         ObjUsuario elUsuario= new ObjUsuario();
         Usuario ProccessUsuario=new Usuario(servidor,user,password);
         elUsuario=(ObjUsuario)ProccessUsuario.getObjeto(idUsuario);
         if(elUsuario!=null)
         {
            return ModificaUsuario(idUsuario,Id_Rol,Nombre_Usuario,Ap_Paterno,Ap_Materno,NickName,PassWord);
         }
         elUsuario=new ObjUsuario();
         elUsuario.setIdUsuario(idUsuario);
         elUsuario.setId_Rol(Id_Rol);
         elUsuario.setNombre_Usuario(Nombre_Usuario);
         elUsuario.setAp_Paterno(Ap_Paterno);
         elUsuario.setAp_Materno(Ap_Materno);
         elUsuario.setNickName(NickName);
         elUsuario.setPassWord(PassWord);
         return ProccessUsuario.setObjeto(elUsuario);
     }
     
     public boolean ModificaUsuario(int idUsuario, ObjRolHogar Id_Rol, String Nombre_Usuario, String Ap_Paterno, String Ap_Materno, String NickName, String PassWord) throws ClassNotFoundException
     {
         ObjUsuario elUsuario= new ObjUsuario();
         Usuario ProccessUsuario=new Usuario(servidor,user,password);
         elUsuario.setIdUsuario(idUsuario);
         elUsuario.setId_Rol(Id_Rol);
         elUsuario.setNombre_Usuario(Nombre_Usuario);
         elUsuario.setAp_Paterno(Ap_Paterno);
         elUsuario.setAp_Materno(Ap_Materno);
         elUsuario.setNickName(NickName);
         elUsuario.setPassWord(PassWord);
         return ProccessUsuario.setObjeto(elUsuario);
     }
     
     public boolean EliminaUsuario(int idUsuario) throws ClassNotFoundException
     {
         ObjUsuario elUsuario= new ObjUsuario();
         Usuario ProccessUsuario=new Usuario(servidor,user,password);
         elUsuario=(ObjUsuario)ProccessUsuario.getObjeto(idUsuario);
         return ProccessUsuario.deleteObjeto(elUsuario);
     }
    
    
    
}
