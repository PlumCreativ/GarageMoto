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
import java.sql.SQLException;
import java.util.ResourceBundle;


public class HelloController implements Initializable{

    //Functions
    @FXML
    private TextField motifField;

    @FXML
    private TextField commentField;

    //Pieces variables
    @FXML
    private ChoiceBox<ViewTablePieces> choicePiece;

    

    //Table Message
    @FXML
    private TableView<ViewTableMessage> tableMessage;

    @FXML
    private TableColumn<ViewTableMessage, Integer> tableMessageId;

    @FXML
    private TableColumn<ViewTableMessage, String> tableMessGarage;

    @FXML
    private TableColumn<ViewTableMessage, String> tableMessUser;

    //Table User
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

    //Table Garage
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

    //Table Pieces

    @FXML
    private TableView<ViewTablePieces> tablePieces;
    
    @FXML
    private TableColumn<ViewTablePieces, Integer> tablePiecesId;
    
    @FXML
    private TableColumn<ViewTablePieces, String> tablePieceName;
    
    @FXML
    private TableColumn<ViewTablePieces, Integer> tablePiecePrix;
    
    @FXML
    private TableColumn<ViewTablePieces, String> tablePieceType;

    //ObservableListe

    
    //Table Manager
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
        tableMotif.setCellValueFactory(new PropertyValueFactory<ViewTableRdv, String>("requestMotif"));
        tableComment.setCellValueFactory(new PropertyValueFactory<ViewTableRdv, String>("requestComment"));

        //Message
        tableMessGarage.setCellValueFactory(new PropertyValueFactory<ViewTableMessage, String>("mess_Garage"));
        tableMessUser.setCellValueFactory(new PropertyValueFactory<ViewTableMessage, String>("mess_User"));

        //Pieces        
        tablePieceName.setCellValueFactory(new PropertyValueFactory<ViewTablePieces, String>("PieceName"));
        tablePiecePrix.setCellValueFactory(new PropertyValueFactory<ViewTablePieces, Integer>("piecePrix"));
        tablePieceType.setCellValueFactory(new PropertyValueFactory<ViewTablePieces, String>("pieceType"));
        
        //Garage
        //TODO---------------------------------------------------------------------------------------------------------------------------

        //User
        tableUserName.setCellValueFactory(new PropertyValueFactory<ViewTableUser, String>("userName")) ;
        tableUserEmail.setCellValueFactory(new PropertyValueFactory<ViewTableUser, String>("mail")) ;
        tableUserAdresse.setCellValueFactory(new PropertyValueFactory<ViewTableUser, String>("adresse")) ;
        tableTelephoneNumber.setCellValueFactory(new PropertyValueFactory<ViewTableUser, Integer>("telephoneNumber")) ;

        //Displayable Liste
        // List<ViewTableRdv> rdvList = new ArrayList<>();
        ObservableList<ViewTableManager> Displayable = FXCollections.observableArrayList();

        Displayable.addAll(
            BD.getAllRequest()
        );
        // tableView.getColumns().addAll(

        //     //Piece
        //     tablePieceName,
            
        //     //User
        //     tableUserName, 
            
        //     //RDV
        //     tableMotif, 
        //     tableComment,

        //     //Garage
        //     tableMessGarage, 
        //     tableMessUser
            

        //     // tableId
            
        //     );
        tableView.setItems(Displayable);

    }


    @FXML
    private void initialiseChoiceBox() throws SQLException {
        this.choicePiece.getItems().clear();
        BD piceBD = new BD();


        ViewTablePieces allRequests = piceBD.getPiecesRequests();

        // while (allRequests.next()) {
        //     int id_piece = allRequests.getInt("id_piece");
        //     String NomPiece = allRequests.getString("nom_piece");
        //     int PrixPiece = allRequests.getInt("prix_piece");
        //     int TypePiece = allRequests.getInt("type_piece");
        //     ViewTablePieces pieceObject = new ViewTablePieces(
        //         id_piece, 
        //         NomPiece, 
        //         PrixPiece, 
        //         TypePiece);
            
        //     System.out.println(
        //         "id    :" + id_piece 
        //         + "  Nom de la piece  :" 
        //         + NomPiece + "  prix de la piece : " 
        //         + PrixPiece + " type de piece " 
        //         + TypePiece + " ."
        //     );
        //}
        this.choicePiece.getItems().addAll(allRequests);        
        

    }


    // public void setTaskData(ActionEvent event) {

    //     ViewTablePieces selectedPiece = choicePiece.getValue();

    //     this.TaskUpdateTest.setText(selectedPiece.getPieceName());
    //     this.infinisCheckUpdate.setSelected(selectedPiece.getPieceType());
    //     this.infinisCheckUpdate.setSelected(selectedPiece.getPieceType());

        
    // }
}
