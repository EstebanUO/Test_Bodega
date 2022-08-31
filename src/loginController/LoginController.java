package loginController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

import conexion.Conexion;

public class LoginController {
	
		Connection con =null;
	    PreparedStatement preparedStatamend = null;
	    ResultSet resulSet =null;
	    
	    
	    public int valLogin (String name,String pass) throws SQLException{
	    	
	    	int valido=1;
	    	String login = name;
	    	
	        String clave = pass;
	        Conexion conect = new Conexion();
	        conect.conectar();
	        
	        if(conect.isConectado()){
	            String query = "SELECT codigo from user where login = '"+login+"' AND clave = '"+clave+"'";
	            try (Statement stm = conect.getCon().createStatement()){
	            	System.out.println("entrotry");
	                ResultSet rst = stm.executeQuery(query);
	                if(rst.next()){
	                	valido=2;
	                    System.out.println("login exitoso");
	      
	                    conect.desconectar();
	                       
	                    
	                }
	                else {
	               	 System.out.println("Usuario o Clave no validos");
	               	 valido=1;
	                }

	                
	            } catch (Exception e) {
	                System.out.println("ERROR: Aborting...");
//	                e.printStackTrace();
	      
	        }
	        }
	        
	        return valido;
	   }
}
