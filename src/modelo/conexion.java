/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Samsung
 */
public class conexion {
    Connection con;
    public String bd = "videoclub";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/" + bd;
    public conexion(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(url,login,password);
}   catch(Exception e){
    System.err.println("Errorr " + e);
    }
}
    public Connection getConnection(){
    return con;
    }
}
