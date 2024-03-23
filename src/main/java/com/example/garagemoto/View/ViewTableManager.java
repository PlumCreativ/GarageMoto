package com.example.garagemoto.View;

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

    public String getMotif() {
        return this.requestMotif.get();
    }

    public String getComment() {
        return this.requestComment.get();
    }

    public ViewTablePieces getPieces() {
        return this.pieces;
    }

    public ViewTableUser getUser() {
        return this.user;
    }

    public ViewTableGarage getGarage() {
        return this.garage;
    }

    public ViewTableMessage getMessage() {
        return this.message;
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


    public void setPieces(ViewTablePieces _pieces) {
        this.pieces = _pieces;
    }

    public void setUser(ViewTableUser _user) {
        this.user = _user;
    }

    public void setGarage(ViewTableGarage _garage) {
        this.garage = _garage;
    }

    public void setMessage(ViewTableMessage message) {
        this.message = message;
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}
