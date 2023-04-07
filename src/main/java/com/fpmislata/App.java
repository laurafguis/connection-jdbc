package com.fpmislata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fpmislata.database.DBUtil;

public class App {
  public static void main(String[] args) {

    // tratar las excepciones checked

    Connection connection = DBUtil.getConnection();
    
  
     /*  DBUtil.closeConnection(connection);
    System.out.println("Conexión cerrada"); */

    // INSERTAMOS UNA PELICULA
    try{
    String sql = "INSERT INTO movies (imdb_id, title, year, image, runtime, description, director_id)" + 
        "VALUES ('tt0071524','Segunda plana',1974, null,105, null, 'nm0000697')";

      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.executeUpdate();
    }catch(SQLException e){
      throw new RuntimeException ("Error ejecución");
    }
  }
}

// SENTENCIAS PREPARADAS CON STATEMENT