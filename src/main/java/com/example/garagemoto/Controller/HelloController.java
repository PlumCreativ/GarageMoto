package com.example.garagemoto.Controller;

import com.example.garagemoto.Model.BD;
import com.example.garagemoto.View.ViewTableGarage;
import com.example.garagemoto.View.ViewTableManager;
import com.example.garagemoto.View.ViewTableRdv;
import com.example.garagemoto.View.ViewTableMessage;
import com.example.garagemoto.View.ViewTablePieces;
import com.example.garagemoto.View.ViewTableUser;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class HelloController implements Initializable{

    // //Functions
    @FXML
    private TextField RequestAddTest;

    @FXML
    private TextField RequestUpdateTest;

    //Table List
    ObservableList<ViewTableManager> listRequest;

    //Table Message
    @FXML
    private TableView<ViewTableMessage> tableMessage;

    @FXML
    private TableColumn<ViewTableMessage, Integer> tableMessageId;

    @FXML
    private TableColumn<ViewTableMessage, String> tableMessGarage;

    @FXML
    private TableColumn<ViewTableMessage, String> tableMessUser;

    // //Table User
    @FXML
    private TableView<ViewTableUser> tableUser;

    @FXML
    private TableColumn<ViewTableUser, Integer> tableUserId;
    
    @FXML
    private TableColumn<ViewTableUser, String> tableUserName;
    
    @FXML
    private TableColumn<ViewTableUser, String> tableUserEmail;
    
    @FXML
    private TableColumn<ViewTableUser, String> tableUserAdresse;
    
    @FXML
    private TableColumn<ViewTableUser, Integer> tableTelephoneNumber;

    // //Table Garage
    @FXML
    private TableView<ViewTableGarage> tableGarage;

    @FXML
    private TableColumn<ViewTableGarage, Integer> tableGarageId;

    @FXML
    private TableColumn<ViewTableGarage, String> tableGarageName;

    @FXML
    private TableColumn<ViewTableGarage, String> tableGarageAdresse;

    @FXML
    private TableColumn<ViewTableGarage, String> tableGarageEmail;

    // //Table Pieces

    @FXML
    private TableView<ViewTablePieces> tablePieces;
    
    @FXML
    private TableColumn<ViewTablePieces, Integer> tablePiecesId;
    
    @FXML
    private TableColumn<ViewTablePieces, String> tablePieceName;
    
    @FXML
    private TableColumn<ViewTablePieces, Integer> tablePiecePrix;
    
    @FXML
    private TableColumn<ViewTablePieces, Integer> tablePieceType;

    //ObservableListe

    
    // //Table Manager
    @FXML
    private TableView<ViewTableManager> tableView = new TableView<>();

    @FXML
    private TableColumn<ViewTableRdv, String> tableMotif;
    
    @FXML
    private TableColumn<ViewTableRdv, String> tableComment;

    @FXML
    private TableColumn<ViewTableRdv, Integer> tableId;


    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Rdv        
        TableColumn<ViewTableManager, String> tableMotif = new TableColumn<>("requestMotif");
        tableMotif.setCellValueFactory(cellData -> cellData.getValue().requestmotifProperty());

        TableColumn<ViewTableManager, String> tableComment = new TableColumn<>("requestComment");
        tableComment.setCellValueFactory(cellData -> cellData.getValue().requestcommentProperty());

        // TableColumn<ViewTableManager, Integer> tableId = new TableColumn<>("requestId");
        // tableId.setCellValueFactory(cellData -> cellData.getValue().requestidProperty());

        //Message
        TableColumn<ViewTableManager, String> tableMessGarage = new TableColumn<>("mess_Garage");
        tableMessGarage.setCellValueFactory(cellData -> cellData.getValue().mess_garageProperty());

        TableColumn<ViewTableManager, String> tableMessUser = new TableColumn<>("mess_User");
        tableMessUser.setCellValueFactory(cellData -> cellData.getValue().mess_userProperty());

        //Pieces        
        TableColumn<ViewTableManager, String> tablePieceName = new TableColumn<>("PieceName");
        tablePieceName.setCellValueFactory(cellData -> cellData.getValue().piecenameProperty());
        
        //Garage
        //TODO---------------------------------------------------------------------------------------------------------------------------

        //User
        TableColumn<ViewTableManager, String> tableUserName = new TableColumn<>("UserName");
        tableUserName.setCellValueFactory(cellData -> cellData.getValue().usernameProperty());

        //Displayable Liste
        // ObservableList<ViewTableManager> Displayable = FXCollections.observableArrayList();
        // Displayable.addAll(
        //     BD.getRdvRequests()
        // );

        tableView.getColumns().addAll(

            //Piece
            tablePieceName,
            
            //User
            tableUserName, 

            //Garage
            tableMessGarage, 
            tableMessUser, 
            
            //RDV
            tableMotif, 
            tableComment
            // tableId
            
            );

        tableView.setItems(BD.getRdvRequests());

    }

    // public ObservableList<ViewTableMessage> getTableView()
    // {
    //     ObservableList<ViewTableManager> data = FXCollections.observableArrayList();
    //     return data.add(new ViewTableMessage(tableMessGarage, tableMessGarage, tableMessUser);
        
    // }



    //Affichage de la base de données
    // @FXML
    // private void initialiseViewTable() throws SQLException {
    //     this.tableView.getItems().clear();
    //     BD db = new BD();
    //     ResultSet allrequests = db.getAllRequest();
    //     while (allrequests.next()){
    //         int requestId = allrequests.getInt("id");
    //         String requestMotif = allrequests.getString("motif");
    //         String requestComment = allrequests.getString("comment");
    //         String requestPiece = allrequests.getString("id_piece");
    //         String requestMessage = allrequests.getString("id_message");
    //         String requestUser = allrequests.getString("id_user");
    //         ViewTableManager request = new ViewTableManager(requestId, requestMotif, requestComment, requestPiece, requestMessage, requestUser);
    //         this.tableView.getItems().addAll(request);
    //         // this.tableView.setOnAction(this::setRequestData);
    //     }

    // }


    // public void setRequestData(ActionEvent event) {
    //     if (tableView.getItems().isEmpty()) {
    //         this.tableView.setCache(false); // Set a default value or clear as needed
    //     } else {
    //         ViewTableManager selectedRequest = tableView.getValue();

    //         this.RequestUpdateTest.setText(selectedRequest.getRequestMotif());
    //         this.RequestUpdateTest.setText(selectedRequest.getRequestComment());
    //         this.RequestUpdateTest.setText(selectedRequest.getRequestPieces());

    //     }
    // }

    // @FXML
    // public void onChangeListe() throws SQLException {
    //     this.listRequest.getItems().clear(); // Use clear() to remove all items

    //     BD db = new BD();
    //     ResultSet allrequests = db.getAllRequest();

    //     while (allrequests.next()) {
    //         // int requestId = allrequests.getInt("id");
    //         String requetMotif = allrequests.getString("Motif");
    //         String requetComment = allrequests.getString("comment");
    //         String requetPieces = allrequests.getString("piece");
    //         String requetMessage = allrequests.getString("message");
    //         String requetUser = allrequests.getString("NomUser");

    //         ViewTableManager requet = new ViewTableManager(requetMotif, requetComment, requetPieces, requetMessage, requetUser);
    //         this.listRequest.getItems().add(requet);
    //     }
    // }

    //CRED
    // @FXML
    // public void onChangerClick() throws SQLException {
    //     ViewTableManager selectedRequest = tableView.getValue();
    //     int requestId = selectedRequest.getRequestId();
    //     String requetMotif = this.RequestUpdateTest.getText();
    //     String requetComment = this.RequestUpdateTest.getText();
    //     String requetPieces = this.RequestUpdateTest.getText();


    //     ViewTableManager requet = new ViewTableManager(requestId, requetMotif, requetComment, requetPieces);
    //     BD db = new BD();
    //     db.updateRequest(requet);
    //     initialiseViewTable();
    // }

    // @FXML
    // protected void onEnregistrerClick(){
    //     System.out.println("Cliqué");
    //     String requetMotif = this.RequestAddTest.getText();
    //     String requetComment = this.RequestAddTest.getText();
    //     String requetPieces = this.RequestAddTest.getText();
    //     String requetMessage = this.RequestAddTest.getText();
    //     String requetUser = this.RequestAddTest.getText();

    //     ViewTableManager requet = new ViewTableManager(requetMotif, requetComment, requetPieces, requetMessage, requetUser);
    //     BD db = new BD();
    //     System.out.println(requetMotif);
    //     db.addRequest(requet);
    // }


    // @FXML
    // public void onSuprimmerClick() throws SQLException {
    //     ViewTableManager selectedRequest = tableView.getValue();
    //     int requestId = selectedRequest.getRequestId();
    //     BD db = new BD();
    //     db.delateRequest(requestId);
    //     initialiseViewTable();
    // }
}
