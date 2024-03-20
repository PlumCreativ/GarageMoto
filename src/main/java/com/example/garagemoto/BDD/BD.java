package com.example.garagemoto.BDD;

import com.example.garagemoto.Model.ViewTableManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class BD{


    public static Connection DbConnection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/moto", "root", "");
            return conn;

        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }

    }

    // public void addRequest(ViewTableManager requestInfo){
    //     Connection conn = null;
    //     PreparedStatement stmt = null;

    //     try {

    //         conn = DriverManager.getConnection("jdbc:mysql://localhost/moto", "root", "");
    //         String query = "INSERT INTO rdv(motif, comment, pieces) VALUES (?, ?, ?, ?, ?)";
    //         stmt = conn.prepareStatement(query);
    //         stmt.setString(1, requestInfo.getRequestMotif());
    //         stmt.setString(2, requestInfo.getRequestComment());
    //         stmt.setString(3, requestInfo.getRequestPieces());
    //         stmt.setString(3, requestInfo.getRequestUser());
    //         stmt.setString(3, requestInfo.getRequestMessage());

    //         stmt.execute();
    //         stmt.close();
    //         conn.close();

    //     }catch (SQLException e){
    //         throw  new RuntimeException(e);
    //     }
    // }

    // public void updateRequest(ViewTableManager requestInfo){
    //     Connection conn = null;
    //     PreparedStatement stmt = null;

    //     try{
    //         conn = DriverManager.getConnection("jdbc:mysql://localhost/moto", "root", "");
    //         String query = "UPDATE `rdv` SET motif = ?, comment = ?, pieces = ? WHERE id = ?";
    //         stmt = conn.prepareStatement(query);
    //         stmt.setString(1, requestInfo.getRequestMotif());
    //         stmt.setString(2, requestInfo.getRequestComment());
    //         stmt.setString(3, requestInfo.getRequestPieces());
    //         // stmt.setInt(4, requestInfo.getRequestId());
    //         stmt.executeUpdate();
    //         stmt.close();
    //         conn.close();

    //     }catch (SQLException e){
    //         throw  new RuntimeException(e);
    //     }
    // }

    // public void delateRequest(int taskId){
    //     Connection conn = null;
    //     PreparedStatement stmt = null;

    //     try{
    //         conn = DriverManager.getConnection("jdbc:mysql://localhost/moto", "root", "");
    //         String query = "DELETE FROM rdv WHERE id = ?";
    //         stmt = conn.prepareStatement(query);
    //         stmt.setInt(1, taskId);
    //         stmt.executeUpdate();
    //         stmt.close();
    //         conn.close();
    //     }catch (SQLException e){
    //         throw  new RuntimeException(e);
    //     }
    // }

    public static ObservableList<ViewTableManager> getAllRequest(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        ObservableList<ViewTableManager> list = FXCollections.observableArrayList();

        try{
            String query = "SELECT * FROM rdv";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                list.add(new ViewTableManager(Integer.parseInt(rs.getString("id_rdv")),
                Integer.parseInt(rs.getString("id_garage")),
                Integer.parseInt(rs.getString("id_user")),
                Integer.parseInt(rs.getString("id_pieces")),
                Integer.parseInt(rs.getString("id_message")),
                rs.getString("comment"),
                rs.getString("motif")));
            }

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        return list;
    }

}
