package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTablePieces {

    private IntegerProperty request_piecesId;
    private StringProperty pieceName;
    private IntegerProperty pieceType;
    private IntegerProperty piecePrix;


    //Getters
    public Integer getRequest_piecesId() {
        return request_piecesId.get();
    }

    public String getPieceName() {
        return pieceName.get();
    }

    public Integer getPieceType() {
        return pieceType.get();
    }

    public Integer getPiecePrix() {
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
    public void setRequest_piecesId(int request_piecesId) {
        this.request_piecesId.set(request_piecesId);
    }

    public void setPieceName(String pieceName) {
        this.pieceName.set(pieceName);
    }

    public void setPieceType(Integer pieceType) {
        this.pieceType.set(pieceType);;
    }

    public void setPiecePrix(int piecePrix) {
        this.piecePrix.set(piecePrix);
    }

    public ViewTablePieces(int _request_piecesId, String _pieceName, int _pieceType, int _piecePrix){
        this.pieceName = new SimpleStringProperty(_pieceName);
        this.pieceType = new SimpleIntegerProperty(_pieceType);
        this.piecePrix = new SimpleIntegerProperty(_piecePrix);

        if (_request_piecesId != 0) {
            this.request_piecesId = new SimpleIntegerProperty(_request_piecesId) ;
        }

    }
}