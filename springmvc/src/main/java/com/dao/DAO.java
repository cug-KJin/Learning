package com.dao;

import com.pojo.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet re = null;
    public boolean chack(user user){
        boolean bool = false;
        try {
            conn = Units.DBinit.getConnection();
            String sql = "select * from springmvc.login where s_username = ? and s_password = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            re = preparedStatement.executeQuery();
            while (re.next()){
                bool = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Units.DBinit.closeAll(re,preparedStatement,conn);
            return bool;
        }
    }
    public boolean Adduser(user user){
        boolean bool = false;
        try {
            conn = Units.DBinit.getConnection();
            String sql = "insert springmvc.login values(?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            int a = preparedStatement.executeUpdate ();
            if(a>0)bool = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Units.DBinit.closeAll(re,preparedStatement,conn);
            return bool;
        }
    }
}
