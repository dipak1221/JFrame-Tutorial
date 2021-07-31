
package com.jdbc.practice;
import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;

public class Main {
    
    public static void main(String[] args) {
        try {
           
            Connection con=ConnectionProvider.getConnection();
            String q="insert into images(pic) value(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File file=jfc.getSelectedFile();
            
            FileInputStream fis=new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available() );
            pstmt.executeUpdate();
            System.out.println("image inserted successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
