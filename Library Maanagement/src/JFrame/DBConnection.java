/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hp
 */
public class DBConnection {
    static Connection con =null;
    public static Connection getConnection(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","");
           }
        catch(Exception e){
        e.printStackTrace();
        }
        return con;
    }
}
