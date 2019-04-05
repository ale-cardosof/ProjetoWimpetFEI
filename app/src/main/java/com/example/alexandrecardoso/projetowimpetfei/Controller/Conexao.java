package com.example.alexandrecardoso.projetowimpetfei.Controller;

import android.content.Context;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class  Conexao {
    public static Connection con = null;


    public static  boolean Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/db_wimpet","root",""); //DB offline
            //con = DriverManager.getConnection("jdbc:mysql://107.180.3.78:3306/teste","teste","teste"); //DB online
        }catch (ClassNotFoundException ex){
            System.out.println("Classe driver não encontrada");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLDataException e){
            System.out.println(e);
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static  boolean login(String user, String pass){
        try{
            Statement stmt = con.createStatement();
            ResultSet resultQuery;

            if(user!=null && pass!=null){
                String sql = "Select * from td_usuario Where login_Usuario='" + user + "' " +
                             "and pass_Usuario='" + pass + "'";
                resultQuery = stmt.executeQuery((sql));
                if(resultQuery.next()){
                    return true;
                }
                else{
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }//
        return false;
    }
}
