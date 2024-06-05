package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTablePieces {

    private static IntegerProperty request_piecesId;
    private static StringProperty pieceName;
    private static IntegerProperty pieceType;
    private static IntegerProperty piecePrix;


    //Getters
    public static Integer getRequest_piecesId() {
        return request_piecesId.get();
    }

    public static String getPieceName() {
        return pieceName.get();
    }

    public static Integer getPieceType() {
        return pieceType.get();
    }

    public static Integer getPiecePrix() {
        return piecePrix.get();
    }

    //Property's
    public final IntegerProperty request_piecesidProperty() {
        return request_piecesId;
     }

    public final StringProperty piecenameProperty() {
        return pieceName;
     }
    
    public final IntegerProperty piecetypeProperty() {
        return pieceType;
    }
    
    public final IntegerProperty pieceprixProperty() {
        return piecePrix;
    }

    //Setters
    public void setRequest_piecesId(Integer request_piecesId) {
        this.request_piecesId.set(getRequest_piecesId());
    }

    public void setPieceName(String pieceName) {
        this.pieceName.set(getPieceName());
    }

    public void setPieceType(Integer pieceType) {
        this.pieceType.set(getPieceType());;
    }

    public void setPiecePrix(int piecePrix) {
        this.piecePrix.set(getPiecePrix());
    }

    public ViewTablePieces(
        int request_piecesId, 
        String pieceName, 
        int pieceType, 
        int piecePrix
        )   {
        this.pieceName = new SimpleStringProperty(pieceName);
        this.pieceType = new SimpleIntegerProperty(pieceType);
        this.piecePrix = new SimpleIntegerProperty(piecePrix);

        if (request_piecesId != 0) {
            this.request_piecesId = new SimpleIntegerProperty(request_piecesId) ;
        }

    }
}