package com.example.garagemoto.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

import com.example.garagemoto.View.ViewTableGarage;
import com.example.garagemoto.View.ViewTableManager;
import com.example.garagemoto.View.ViewTableMessage;
import com.example.garagemoto.View.ViewTablePieces;
import com.example.garagemoto.View.ViewTableUser;

public class BD{


    Connection conn = null;
    public static Connection DbConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/moto", "root", "");
            return conn;

        } catch (Exception exception) {
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

    /**
     * @return
     */
    public static ObservableList<ViewTableMessage> getAllRequest(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        ObservableList<ViewTableMessage> list = FXCollections.observableArrayList();

        try{
            String query = 
            "SELECT * FROM message";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                Integer id_message = rs.getInt("id_message");
                String mess_Garage = rs.getString("messageGarage");
                String mess_User = rs.getString("messageUser");
                list.add(new ViewTableMessage(id_message, mess_Garage, mess_User));
                System.out.println(
                    "id    :" + id_message + "  Message Garagiste  :" + mess_Garage + "  Message User  :" + mess_User
                );
            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        return list;
    }
    // /**
    //  * @return
    //  */
    // public static ObservableList<ViewTableManager> getAllRequest(){
    //     Connection conn = DbConnection();
    //     PreparedStatement pr_stmt = null;
    //     ResultSet rs = null;

    //     ObservableList<ViewTableManager> list = FXCollections.observableArrayList();

    //     try{
    //         String query = 
    //         "SELECT * " +
    //         "FROM rdv r JOIN garage g ON r.id_garage = g.id_garage " +
    //         "JOIN message m ON r.id_message = m.id_message " +
    //         "JOIN pieces p ON r.id_piece = p.id_piece " +
    //         "JOIN user u ON r.id_user = u.id_user";
    //         pr_stmt = conn.prepareStatement(query);
    //         rs = pr_stmt.executeQuery();
    //         while (rs.next()) {
    //             list.add(
    //                 new ViewTableManager(Integer.parseInt(rs.getString("id_rdv")),
    //                     new ViewTableGarage(
    //                         rs.getInt("id_garage"),
    //                         rs.getString("NomGarage"),
    //                         rs.getString("Adresse"),
    //                         rs.getString("Email")),

    //                     new ViewTableUser(
    //                         rs.getInt("id_user"),
    //                         rs.getString("NomUser"),
    //                         rs.getString("Email"),
    //                         rs.getString("adresse"),
    //                         rs.getInt("num_telephone")),

    //                     new ViewTablePieces(
    //                         rs.getInt("id_piece"),
    //                         rs.getString("nom_piece"),
    //                         rs.getInt("prix_piece"),
    //                         rs.getInt("type_piece")),

    //                     new ViewTableMessage(
    //                         rs.getInt("id_message"),
    //                         rs.getString("messageGarage"),
    //                         rs.getString("messageUser")),

    //                     rs.getString("comment"),
    //                     rs.getString("motif"))
    //             );
    //         }
    //         conn.close();
    //         pr_stmt.close();

    //     }catch (SQLException e){
    //         throw  new RuntimeException(e);
    //     }
    //     return list;
    // }

}
