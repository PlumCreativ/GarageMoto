package com.example.garagemoto.View;


public class ViewTablePieces {

    private int request_piecesId;
    private String pieceName;
    private int pieceType;
    private int piecePrix;


    //Getters
    public  int getRequest_piecesId() {
        return this.request_piecesId;
    }

    public  String getPieceName() {
        return this.pieceName;
    }

    public  Integer getPieceType() {
        return this.pieceType;
    }

    public  Integer getPiecePrix() {
        return this.piecePrix;
    }



    //Setters
    public void setRequest_piecesId(int request_piecesId) {
        this.request_piecesId = request_piecesId;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public void setPieceType(int pieceType) {
        this.pieceType = pieceType;;
    }

    public void setPiecePrix(int piecePrix) {
        this.piecePrix = piecePrix;
    }

    public ViewTablePieces(
        int request_piecesId, 
        String pieceName, 
        int pieceType, 
        int piecePrix
        )   {
        this.pieceName = pieceName;
        this.pieceType = pieceType;
        this.piecePrix = piecePrix;

        if (request_piecesId != 0) {
            this.request_piecesId = request_piecesId ;
        }

    }

    @Override
    public String toString() {
        return "Piece: " + pieceName + " - " + piecePrix + " € " + " - " + (pieceType);
    }
}