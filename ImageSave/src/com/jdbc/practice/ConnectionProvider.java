
package com.jdbc.practice;
import java.sql.*;

public class ConnectionProvider {
    private static Connection con;
    
   public static Connection getConnection(){
       try{
       if(con==null){
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/springdb";
           String username="root";
           String password="";
        con=DriverManager.getConnection(url,username,password);
            System.out.println("This is testing");
       }
       }catch(Exception e){
           e.printStackTrace();
       }
       return con;
   }
}
