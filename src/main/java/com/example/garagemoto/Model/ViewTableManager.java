package com.example.garagemoto.Model;

import javafx.beans.property.SimpleStringProperty;

public class ViewTableManager {

    // private int requestId;
    private int requestId, request_userId, request_garageId, request_piecesId, request_messageId; 
    private SimpleStringProperty requestMotif, requestComment;


    public ViewTableManager(
        int requestId,
        int request_garageId,
        int request_userId,
        int request_piecesId,
        int request_messageId,
        String requestMotif,
        String requestComment
        ) {
        this.requestMotif = new SimpleStringProperty(requestMotif);
        this.requestComment = new SimpleStringProperty(requestComment);
        this.request_piecesId = request_piecesId;
        this.request_garageId = request_garageId;
        this.request_userId = request_userId;
        this.request_messageId = request_messageId;

        if (requestId != 0) {
            this.requestId = requestId;
        }
    }


    //Getters
    public int getRequestId() {
        return this.requestId;
    }

    public String getRequestMotif() {
        return this.requestMotif.get();
    }

    public String getRequestComment() {
        return this.requestComment.get();
    }

    public int getRequestPieces() {
        return this.request_piecesId;
    }

    public int getRequestUser() {
        return this.request_userId;
    }

    public int getRequestMessage() {
        return this.request_messageId;
    }


    //Setters
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setRequestMotif(SimpleStringProperty requestMotif) {
        this.requestMotif = requestMotif;
    }

    public void setRequestComment(SimpleStringProperty requestComment) {
        this.requestComment = requestComment;
    }


    public void setRequestPieces(int request_piecesId) {
        this.request_piecesId = request_piecesId;
    }

    public void setRequestUser(int request_userId) {
        this.request_userId = request_userId;
    }

    public void setRequestMessage(int request_messageId) {
        this.request_messageId = request_messageId;
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}