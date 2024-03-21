package com.example.garagemoto.Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViewTableManager {

    private ViewTablePieces pieces;    
    private ViewTableMessage message;    
    private ViewTableUser user;    
    private ViewTableGarage garage;    
    private SimpleIntegerProperty requestId; 
    private SimpleStringProperty requestMotif, requestComment;


    public ViewTableManager(
        int _requestId,
        ViewTableGarage _garage,
        ViewTableUser _user,
        ViewTablePieces _pieces,
        ViewTableMessage _message,
        String _requestMotif,
        String _requestComment
        ) {
        this.requestMotif = new SimpleStringProperty(_requestMotif);
        this.requestComment = new SimpleStringProperty(_requestComment);
        this.pieces = _pieces ;
        this.garage = _garage ;
        this.user = _user ;
        this.message = _message ;

        if (_requestId != 0) {
            this.requestId = new SimpleIntegerProperty(_requestId) ;
        }
    }


    //Getters
    public int getRequestId() {
        return this.requestId.get();
    }

    public String getRequestMotif() {
        return this.requestMotif.get();
    }

    public String getRequestComment() {
        return this.requestComment.get();
    }

    public ViewTablePieces getRequestPieces() {
        return this.pieces;
    }

    public ViewTableUser getRequestUser() {
        return this.user;
    }

    public ViewTableGarage getRequestGarage() {
        return this.garage;
    }

    public ViewTableMessage getRequestMessage() {
        return this.message;
    }


    //Setters
    public void setRequestId(SimpleIntegerProperty requestId) {
        this.requestId = requestId;
    }

    public void setRequestMotif(SimpleStringProperty requestMotif) {
        this.requestMotif = requestMotif;
    }

    public void setRequestComment(SimpleStringProperty requestComment) {
        this.requestComment = requestComment;
    }


    public void setRequestPieces(ViewTablePieces _pieces) {
        this.pieces = _pieces;
    }

    public void setRequestUser(ViewTableUser _user) {
        this.user = _user;
    }

    public void setRequestGarage(ViewTableGarage _garage) {
        this.garage = _garage;
    }

    public void setRequestMessage(ViewTableMessage message) {
        this.message = message;
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}
