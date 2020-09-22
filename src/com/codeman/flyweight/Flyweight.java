package com.codeman.flyweight;

import java.sql.*;
import java.util.List;
import java.util.Vector;

/**
 * 享元模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月22日 08:27:00
 */
public class Flyweight {

    public static void main(String[] args) throws SQLException {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection conn = connectionPool.getConn();
        PreparedStatement preparedStatement = conn.prepareStatement("select * from article");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String uid = resultSet.getString(1);
            System.out.println(uid);
        }
        System.out.println(resultSet);
    }
}

class ConnectionPool{
    private Vector<Connection> pool;
    private String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai";
    private String username = "root";
    private String password = "welcome123";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 10;
    private ConnectionPool instance = null;
    Connection conn = null;

    public ConnectionPool(){
        pool = new Vector<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void realse(){
        pool.add(conn);
    }

    public synchronized Connection getConn(){
        if (pool.size()>0){
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }else {
            return null;
        }
    }
}