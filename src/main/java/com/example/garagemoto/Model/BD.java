package com.example.garagemoto.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.List;

import com.example.garagemoto.View.ViewTableGarage;
import com.example.garagemoto.View.ViewTableManager;
import com.example.garagemoto.View.ViewTableRdv;
import com.example.garagemoto.View.ViewTableMessage;
import com.example.garagemoto.View.ViewTablePieces;
import com.example.garagemoto.View.ViewTableUser;

public class BD{

    // static ObservableList<ViewTableManager> Displayable = FXCollections.observableArrayList();
    static ViewTablePieces pieceObject;
    static ViewTableUser userlist;
 


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


    //Add methods 
    public void addRDVRequest(ViewTableRdv requestInfo){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DbConnection();
            String query = "INSERT INTO rdv(motif, comment) VALUES (?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, requestInfo.getMotif());
            stmt.setString(2, requestInfo.getComment());

            stmt.execute();
            stmt.close();
            conn.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }

    public void updateRDVRequest(ViewTableRdv requestInfo){
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = DbConnection();
            String query = "UPDATE `rdv` SET motif = ?, comment = ? WHERE id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, requestInfo.getMotif());
            stmt.setString(2, requestInfo.getComment());
            stmt.setInt(3, requestInfo.getRequestId());

            //Execute & Close Request
            stmt.executeUpdate();
            stmt.close();
            conn.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }

    public void delateRequest(int taskId){
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = DbConnection();
            String query = "DELETE FROM rdv WHERE id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, taskId);

            //Execute & Close Request
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }



    
    //Message Database Request
    public void getMessageRequests(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        // ObservableList<ViewTableMessage> list = FXCollections.observableArrayList();

        try{
            String query = 
            "SELECT * FROM message";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                Integer id_message = rs.getInt("id_message");
                String mess_Garage = rs.getString("messageGarage");
                String mess_User = rs.getString("messageUser");
                
                new ViewTableMessage(
                    id_message, 
                    mess_Garage, 
                    mess_User
                    );

                System.out.println(
                    "id    :" + id_message + "  Message Garagiste  :" + mess_Garage + "  Message User  :" + mess_User
                );
            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }


    //Piece Database Request
    public ViewTablePieces getPiecesRequests(){
        Connection conn = DbConnection();
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            String query = 
            "SELECT * FROM pieces";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                Integer id_piece = rs.getInt("id_piece");
                String NomPiece = rs.getString("nom_piece");
                Integer PrixPiece = rs.getInt("prix_piece");
                String TypePiece = rs.getString("type_piece");
                pieceObject = new ViewTablePieces(
                    id_piece, 
                    NomPiece, 
                    PrixPiece, 
                    TypePiece);
             
                System.out.println(
                    "id    :" + id_piece 
                    + "  Nom de la piece  :" 
                    + NomPiece + "  prix de la piece : " 
                    + PrixPiece + " type de piece " 
                    + TypePiece + " ."
                );
            }
            return pieceObject;
            
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        
    }

    //User Database Request
    public static ViewTableUser getUserRequests(){
        Connection conn = DbConnection();
        Statement pr_stmt = null;
        ResultSet rs = null;



        try{
            String query = 
            "SELECT * FROM user";
            pr_stmt = conn.createStatement();
            rs = pr_stmt.executeQuery(query);


            while (rs.next()) {
                Integer id_user = rs.getInt("id_user");
                String UserName = rs.getString("NomUser");
                String UserEmail = rs.getString("Email");
                String UserAdresse = rs.getString("adresse");
                Integer TellNum = rs.getInt("num_telephone");

                userlist = new ViewTableUser(
                    id_user, 
                    UserName, 
                    UserEmail, 
                    UserAdresse,
                    TellNum
                );


                System.out.println(
                    "id    :" + id_user 
                    + "  Nom utilisateur  :" 
                    + UserName + "  mail utilisateur : " 
                    + UserEmail + "  adresse utilisateur : " 
                    + UserAdresse + " téléphone utilisateur " 
                    + TellNum + " ."
                );
            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return userlist;
    }

    //Garage Database Request
    public void getGarageRequests(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        try{
            String query = 
            "SELECT * FROM garage";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                Integer id_garage = rs.getInt("id_garage");
                String GarageName = rs.getString("NomGarage");
                String GarageAdresse = rs.getString("Adresse");
                String GarageEmail = rs.getString("Email");

                new ViewTableGarage(
                    id_garage, 
                    GarageName, 
                    GarageAdresse, 
                    GarageEmail
                );

                System.out.println(
                    "id    :" + id_garage 
                    + "  Nom du garagiste  :" 
                    + GarageName + "  mail du garagiste : " 
                    + GarageAdresse + "  adresse du garagiste : " 
                    + GarageEmail + " téléphone du garagiste " 
                    + " ."
                );
            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

    }


    //RDV Database Request
    public static ObservableList<ViewTableRdv> getRdvRequests(){
        Connection conn = DbConnection();
        Statement pr_stmt = null;
        ResultSet rs = null;

        ObservableList<ViewTableRdv> list = FXCollections.observableArrayList();


        
        try{
            // list.clear();
            
            String query = 
            "SELECT * FROM rdv";
            pr_stmt = conn.createStatement();
            rs = pr_stmt.executeQuery(query);

            list.clear();

            ViewTableRdv rdvlist;
            while (rs.next()){
                Integer requestId = rs.getInt("id_rdv");
                String  requestComment = rs.getString("comment");
                String requestMotif = rs.getString("motif");
        
                rdvlist = new ViewTableRdv(
                    requestId,
                    requestMotif,                      
                    requestComment
                );

                list.add( rdvlist );
    
                System.out.println(
                    "id    :" + requestId 
                    + "  commentaire  :" + requestComment
                    + "  motif : " + requestMotif
                    +  " ."
                );
        }
            conn.close();
            pr_stmt.close();
            
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
        return list;
    }

    public static ObservableList<ViewTableManager> getAllRequest(){
    Connection conn = DbConnection();
    PreparedStatement pr_stmt = null;
    ResultSet rs = null;

    // Creation of table Manager list
    //keep data from different tables but of the same Class type
    ObservableList<ViewTableManager> list = FXCollections.observableArrayList();

        try{
            String query = 
            "SELECT * " + // Selection of all database tables needed to fill tableView
            "FROM rdv r JOIN garage g ON r.id_garage = g.id_garage " +
            "JOIN message m ON r.id_message = m.id_message " +
            "JOIN pieces p ON r.id_piece = p.id_piece " +
            "JOIN user u ON r.id_user = u.id_user";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();

            ViewTableManager managerlist;
            while (rs.next()) {

                //rdv data
                Integer requestId = rs.getInt("id_rdv");
                String  requestComment = rs.getString("comment");
                String requestMotif = rs.getString("motif");

                //User data
                Integer id_user = rs.getInt("id_user");
                String UserName = rs.getString("NomUser");
                String UserEmail = rs.getString("Email");
                String UserAdresse = rs.getString("adresse");
                Integer TellNum = rs.getInt("num_telephone");

                //Pieces data
                Integer id_piece = rs.getInt("id_piece");
                String NomPiece = rs.getString("nom_piece");
                Integer PrixPiece = rs.getInt("prix_piece");
                String TypePiece = rs.getString("type_piece");

                //Message data
                Integer id_message = rs.getInt("id_message");
                String mess_Garage = rs.getString("messageGarage");
                String mess_User = rs.getString("messageUser");
                //Creation Manager Object
                managerlist = new ViewTableManager(
                    requestMotif,                      
                    requestComment,
                    
                    UserName, 
                    UserEmail, 
                    UserAdresse,
                    TellNum,

                    NomPiece, 
                    TypePiece,
                    PrixPiece, 

                    mess_Garage,
                    mess_User
                );

                //add the Object to the list to return him later
                list.addAll(managerlist);

            }
            conn.close();
            pr_stmt.close();
            //After request close all access to database

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        return list;
    }

}

