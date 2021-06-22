/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.simulation.system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
//       Class.forName("com.mysql.jdbc.Driver");
        try {
            Class.forName("com.mysql.jdbc.Driver");

//            DriverManager.get
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project2", "root", "");
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println("Error "+e);
        }

    }

}
