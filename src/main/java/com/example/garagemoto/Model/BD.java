package com.example.garagemoto.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.sql.*;

import com.example.garagemoto.View.ViewTableGarage;
import com.example.garagemoto.View.ViewTableManager;
import com.example.garagemoto.View.ViewTableRdv;
import com.example.garagemoto.View.ViewTableMessage;
import com.example.garagemoto.View.ViewTablePieces;
import com.example.garagemoto.View.ViewTableUser;

public class BD{

    static ObservableList<ViewTableManager> Displayable = FXCollections.observableArrayList();
 


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

    public void addRDVRequest(ViewTableRdv requestInfo){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DbConnection();
            String query = "INSERT INTO rdv(motif, comment) VALUES (?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, ViewTableRdv.getMotif());
            stmt.setString(2, ViewTableRdv.getComment());

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
            stmt.setString(1, ViewTableRdv.getMotif());
            stmt.setString(2, ViewTableRdv.getComment());
            stmt.setInt(3, ViewTableRdv.getRequestId());

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
            stmt.setInt(1, ViewTableRdv.getRequestId());

            //Execute & Close Request
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }

    //Message Database Request
    public static ViewTableManager getMessageRequests(){
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
        ViewTableManager DisplayableMessage = ( new ViewTableManager(
        ViewTableMessage.getRequest_messageId(),
        ViewTableMessage.getMess_Garage(),
        ViewTableMessage.getMess_User()
        ));
        return DisplayableMessage;
    }


    //Piece Database Request
    public static ViewTableManager getPiecesRequests(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        // ObservableList<ViewTablePieces> list = FXCollections.observableArrayList();

        try{
            String query = 
            "SELECT * FROM pieces";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                Integer id_piece = rs.getInt("id_piece");
                String NomPiece = rs.getString("nom_piece");
                Integer PrixPiece = rs.getInt("prix_piece");
                Integer TypePiece = rs.getInt("type_piece");
                new ViewTablePieces(
                    id_piece, 
                    NomPiece, 
                    PrixPiece, 
                    TypePiece);
                // list.add(
                //     );
                    System.out.println(
                        "id    :" + id_piece 
                        + "  Nom de la piece  :" 
                        + NomPiece + "  prix de la piece : " 
                        + PrixPiece + " type de piece " 
                        + TypePiece + " ."
                    );
            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        ViewTableManager DisplayablePiece = new ViewTableManager(
            ViewTablePieces.getRequest_piecesId(), 
            ViewTablePieces.getPieceName(), 
            ViewTablePieces.getPiecePrix(), 
            ViewTablePieces.getPieceType()
            );
        return DisplayablePiece;

    }

    //User Database Request
    public static ViewTableManager getUserRequests(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        try{
            String query = 
            "SELECT * FROM user";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();
            while (rs.next()) {
                Integer id_user = rs.getInt("id_user");
                String UserName = rs.getString("NomUser");
                String UserEmail = rs.getString("Email");
                String UserAdresse = rs.getString("adresse");
                Integer TellNum = rs.getInt("num_telephone");

                new ViewTableUser(
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
            throw  new RuntimeException(e);
        }
        ViewTableManager DisplayableUser = new ViewTableManager(
            ViewTableUser.getRequest_userId(), 
            ViewTableUser.getUserName(), 
            ViewTableUser.getMaile(), 
            ViewTableUser.getAdresse(),
            ViewTableUser.getTelephoneNumber()
        );
        return DisplayableUser;
    }

    //Garage Database Request
    public static ViewTableManager getGarageRequests(){
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

        ViewTableManager DisplayableGarage = new ViewTableManager(
            ViewTableGarage.getRequest_garageId(), 
            ViewTableGarage.getGarageName(), 
            ViewTableGarage.getAdresse(),
            ViewTableGarage.getMaile()
        );

        return DisplayableGarage;
    }


    //RDV Database Request
    @FXML
    public void getRdvRequests(){
        Connection conn = DbConnection();
        PreparedStatement pr_stmt = null;
        ResultSet rs = null;

        ObservableList<ViewTableManager> list = FXCollections.observableArrayList();


        try{
            String query = 
            "SELECT * FROM rdv";
            pr_stmt = conn.prepareStatement(query);
            rs = pr_stmt.executeQuery();

            list.clear();

            while (rs.next()) {
                Integer requestId = rs.getInt("id_rdv");

                String  requestComment = rs.getString("comment");
                String requestMotif = rs.getString("motif");
            
                list.add(
                    new ViewTableManager(
                        requestId,                        
                        requestComment,
                        requestMotif
                    )           
                );

                System.out.println(
                    "id    :" + requestId 
                    + "  commentaire  :" 
                    + requestComment + "  motif : " 
                    + requestMotif +  " ."
                );

            }
            conn.close();
            pr_stmt.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static ObservableList<ViewTableManager> Displayable(){
        Displayable.addAll(
            getMessageRequests(),
            getPiecesRequests()
            );


        return Displayable;

    }

}
