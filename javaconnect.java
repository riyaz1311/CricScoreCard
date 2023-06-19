/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sudharsan
 */
import java.sql.*;

public class javaconnect {
    public static Connection connectdb() throws SQLException
    {
        Connection con = null;
        try
        {
            con =DriverManager.getConnection("jdbc:derby://localhost:1527/Scoredata","score","score");
            return con;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}