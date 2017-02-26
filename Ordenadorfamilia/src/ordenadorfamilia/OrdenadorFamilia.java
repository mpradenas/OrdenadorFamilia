/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorfamilia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Gamalyon
 */
public class OrdenadorFamilia {

   
    public static void main(String[] args) {
       
        //esta es practicamente la clase program que se usa para iniciar las aplicaciones
        
        Login entrada=new Login();
        entrada.setVisible(true);
            
    }
    
    public static String[] traeDatos() throws FileNotFoundException, IOException
    {
        String[] arreglo=new String[3];
        try
        {
          Properties prop=new Properties();
          FileReader lector=new FileReader("BaseDatos.properties");
          prop.load(lector);
          arreglo[0]=prop.getProperty("user");
          arreglo[1]=prop.getProperty("database");
          arreglo[2]=prop.getProperty("password");
        }
        catch(IOException ex)
        {
           arreglo=null;
        }
        return arreglo;
    }
    
}
