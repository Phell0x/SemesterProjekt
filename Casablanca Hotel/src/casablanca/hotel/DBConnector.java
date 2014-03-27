/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package casablanca.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
*
*
* @author kaihultmann
*/

public class DBConnector {

	  private static String id = "cphtn17";						//Insert ORACLE id and password
	  private static String pw = "cphtn17";
	 
          
	  public Connection getConnection()
	  {
	    Connection con = null;
	    try 
	    {  
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      con = DriverManager.getConnection(
	          "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat", DBConnector.id,  DBConnector.pw );  
	    }
	    catch (ClassNotFoundException | SQLException e) 
	    {   
	    	System.out.println("\n*** Remember to insert your Oracle ID and PW in the DBConnector class! ***\n");
	    	System.out.println("error in DBConnector.getConnection()");
	        System.out.println(e); 	     
	    }    

	    return con;
            
            }
          
          }
	  