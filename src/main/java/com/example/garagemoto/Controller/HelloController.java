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
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<ViewTableManager, String> tableMotif;
    
    @FXML
    private TableColumn<ViewTableManager, String> tableComment;

    @FXML
    private TableColumn<ViewTableManager, Integer> tableId;

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

        tableId.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("requestId"));

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
            
            //RDV
            tableMotif, 
            tableComment,

            //Garage
            tableMessGarage, 
            tableMessUser
            

            // tableId
            
            );


        listRequest = BD.Displayable();

        tableView.setItems(listRequest);

    }

}
