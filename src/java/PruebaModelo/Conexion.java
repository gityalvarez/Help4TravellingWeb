/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaModelo;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
/**
 *
 * @author yaman
 */
public class Conexion {
    
    public static final String USERNAME ="root";
    public static final String PASSWORD = "root";
    public static final String HOST ="localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "help4traveling";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL="jdbc:mysql://"+ HOST+":"+PORT+"/"+DATABASE;
    
    public java.sql.Connection con;
    
        public Conexion(){
            try{
                Class.forName(CLASSNAME);
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e){
                System.out.println("ERROR");
                
            } catch (SQLException e){
                System.out.println("ERROR");
            }
            
        }         
}
