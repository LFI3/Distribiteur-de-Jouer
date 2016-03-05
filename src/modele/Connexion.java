
package modele;

import static java.lang.Class.forName;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion 
{
    private Connection c=null;
    private Statement  s=null;
	
	public Connexion()
	{
		    //*********************************//
		    try
		    {
			   forName("com.mysql.jdbc.Driver");
		    }
		    //*********************************//
	            catch(ClassNotFoundException e) 
		    {
			System.out.println(e);
		    }
		    //*********************************//
	            try
	            {
	        	c=getConnection("jdbc:mysql://localhost:3306/jeux","root","") ;
	        	s = c.createStatement();
	            }
	            //*********************************//
	            catch(SQLException e)
	            {
	        	System.out.println(e);
	            }
			//*********************************//   
	}
	
	public Connection getC(){return c;}
	public Statement getS(){return s;}
	
}
