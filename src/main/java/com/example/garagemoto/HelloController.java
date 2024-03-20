package com.example.garagemoto;

import com.example.garagemoto.BDD.BD;
import com.example.garagemoto.Model.ViewTableManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private TextField RequestAddTest;

    @FXML
    private TextField RequestUpdateTest;

    @FXML
    private ObservableList<ViewTableManager> listRequest;

    @FXML
    private TableView<ViewTableManager> tableView;

    @FXML
    private TableColumn<ViewTableManager, String> tableMotif;

    @FXML
    private TableColumn<ViewTableManager, String> tableComment;

    @FXML
    private TableColumn<ViewTableManager, Integer> tablePieces;

    @FXML
    private TableColumn<ViewTableManager, Integer> tableId;

    @FXML
    private TableColumn<ViewTableManager, Integer> tableMessage;

    @FXML
    private TableColumn<ViewTableManager, Integer> tableUser;

    @FXML
    private TableColumn<ViewTableManager, Integer> tableGarage;


    int index = -1;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        tableId.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("requestId"));
        tableGarage.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("request_garageId"));
        tableUser.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("request_userId"));
        tablePieces.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("request_piecesId"));
        tableMessage.setCellValueFactory(new PropertyValueFactory<ViewTableManager, Integer>("request_messageId"));
        tableMotif.setCellValueFactory(new PropertyValueFactory<ViewTableManager, String>("requestMotif"));
        tableComment.setCellValueFactory(new PropertyValueFactory<ViewTableManager, String>("requestComment"));

        listRequest = BD.getAllRequest();
        tableView.setItems(listRequest);

        // tableView.setItems(getTableView());
    }

    // public ObservableList<ViewTableManager> getTableView()
    // {
    //     ObservableList<ViewTableManager> data = FXCollections.observableArrayList();
    //     data.add(new ViewTableManager("Motif", "Comment", "Piece", "User", "Message"));
    //     return data;
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
