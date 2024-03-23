package com.example.garagemoto.View;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViewTablePieces {

    private SimpleIntegerProperty request_piecesId;
    private SimpleStringProperty pieceName;
    private SimpleIntegerProperty pieceType;
    private SimpleIntegerProperty piecePrix;

    public ViewTablePieces(int _request_piecesId, String _pieceName, int _pieceType, int _piecePrix){
        this.pieceName = new SimpleStringProperty(_pieceName);
        this.pieceType = new SimpleIntegerProperty(_pieceType);
        this.piecePrix = new SimpleIntegerProperty(_piecePrix);

        if (_request_piecesId != 0) {
            this.request_piecesId = new SimpleIntegerProperty(_request_piecesId) ;
        }

    }

    //Getters
    public SimpleIntegerProperty getRequest_piecesId() {
        return request_piecesId;
    }

    public SimpleStringProperty getPieceName() {
        return pieceName;
    }

    public SimpleIntegerProperty getPieceType() {
        return pieceType;
    }

    public SimpleIntegerProperty getPiecePrix() {
        return piecePrix;
    }


    //Setters
    public void setRequest_piecesId(SimpleIntegerProperty request_piecesId) {
        this.request_piecesId = request_piecesId;
    }

    public void setPieceName(SimpleStringProperty pieceName) {
        this.pieceName = pieceName;
    }

    public void setPieceType(SimpleIntegerProperty pieceType) {
        this.pieceType = pieceType;
    }

    public void setPiecePrix(SimpleIntegerProperty piecePrix) {
        this.piecePrix = piecePrix;
    }

}
