package com.example.garagemoto.View;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableManager {

    private SimpleStringProperty PieceName;    
    private SimpleStringProperty UserMess;    
    private SimpleStringProperty GarageMess;    
    private SimpleStringProperty UserName;    
    private SimpleIntegerProperty requestId; 
    private SimpleStringProperty requestMotif, requestComment;


    public ViewTableManager(
        int _requestId,
        String _requestMotif,
        String _requestComment,
        String _messageGarage,
        String _messageUser,
        String _userName,
        String _pieceName

        ) {
        this.requestMotif = new SimpleStringProperty(_requestMotif);
        this.requestComment = new SimpleStringProperty(_requestComment);
        this.PieceName = new SimpleStringProperty(_pieceName);
        this.GarageMess = new SimpleStringProperty(_messageGarage);
        this.UserMess = new SimpleStringProperty(_messageUser);
        this.UserName = new SimpleStringProperty(_userName);

        if (_requestId != 0) {
            this.requestId = new SimpleIntegerProperty(_requestId) ;
        }
    }


    public ViewTableManager(Integer requestId2, String requestComment2, String requestMotif2, String mess_Garage,
            String mess_User, String userName2, String pieceName2) {
        //TODO Auto-generated constructor stub
    }


    //Getters
    public int getRequestId() {
        return this.requestId.get();
    }

    public String getMotif() {
        return this.requestMotif.get();
    }

    public String getComment() {
        return this.requestComment.get();
    }

    public String getPieces() {
        return this.PieceName.get();
    }

    public String getUserName() {
        return this.UserName.get();
    }

    public String getGarage() {
        return this.GarageMess.get();
    }

    public String getUser() {
        return this.UserMess.get();
    }

        //Property's
    public final StringProperty requestMotifProperty() {
        return requestMotif;
     }

    public final StringProperty requestCommentProperty() {
        return requestComment;
     }


    //Setters
    public void setRequestId(SimpleIntegerProperty requestId) {
        this.requestId = requestId;
    }

    public void setMotif(SimpleStringProperty requestMotif) {
        this.requestMotif = requestMotif;
    }

    public void setComment(SimpleStringProperty requestComment) {
        this.requestComment = requestComment;
    }


    public void setPieces(SimpleStringProperty _pieceName) {
        this.PieceName = _pieceName;
    }

    public void setUser(SimpleStringProperty _userName) {
        this.UserName = _userName;
    }

    public void setGarage(SimpleStringProperty _messageGarage) {
        this.GarageMess = _messageGarage;
    }

    public void setMessage(SimpleStringProperty _messageUser) {
        this.UserMess = _messageUser;
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}
