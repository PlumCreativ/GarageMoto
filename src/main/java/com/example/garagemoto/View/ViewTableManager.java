package com.example.garagemoto.View;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableManager {
    private  StringProperty requestMotif;
    private  StringProperty requestComment;

    private  StringProperty userName;
    private  StringProperty mail;
    private  StringProperty adresse;
    private  IntegerProperty telephoneNumber;

    private  StringProperty pieceName;
    private  IntegerProperty pieceType;
    private  IntegerProperty piecePrix;


    private  StringProperty mess_Garage;
    private  StringProperty mess_User;
    //Constructor
    public ViewTableManager(
        String _requestMotif,
        String _requestComment,

        String _userName, 
        String _mail, 
        String _adresse, 
        int _telephoneNumber,

        String _pieceName, 
        int _pieceType, 
        int _piecePrix,

        String _mess_Garage, 
        String _mess_User
        ) {
        requestMotif = new SimpleStringProperty(_requestMotif);
        requestComment = new SimpleStringProperty(_requestComment);

        userName = new SimpleStringProperty(_userName);
        mail = new SimpleStringProperty(_mail);
        adresse = new SimpleStringProperty(_adresse);
        telephoneNumber = new SimpleIntegerProperty(_telephoneNumber);
        
        pieceName = new SimpleStringProperty(_pieceName);
        pieceType = new SimpleIntegerProperty(_pieceType);
        piecePrix = new SimpleIntegerProperty(_piecePrix);

        mess_Garage = new SimpleStringProperty(_mess_Garage) ;
        mess_User = new SimpleStringProperty(_mess_User) ;
    }


    //Getters

    public String getMotif() {
        return requestMotif.get();
    }

    public String getComment() {
        return requestComment.get();
    }

    public  String getUserName() {
        return userName.get();
    }

    public  String getMaile() {
        return mail.get();
    }

    public  String getAdresse() {
        return adresse.get();
    }

    public  int getTelephoneNumber() {
        return telephoneNumber.get();
    }

    public  String getPieceName() {
        return pieceName.get();
    }

    public  Integer getPieceType() {
        return pieceType.get();
    }

    public  Integer getPiecePrix() {
        return piecePrix.get();
    }

    public  String getMess_Garage() {
        return mess_Garage.get();
    }
    
    public  String getMess_User() {
        return mess_User.get();
    }

    //Property's
    public StringProperty requestMotifProperty() {
        return requestMotif;
    }

    public StringProperty requestCommentProperty() {
        return requestComment;
    }

    public  StringProperty usernameProperty() {
        return userName;
     }
    
    public  StringProperty mailProperty() {
        return mail;
    }
    
    public  StringProperty adresseProperty() {
        return adresse;
    }

    public  IntegerProperty telephonenumberProperty() {
        return telephoneNumber;
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

    public final StringProperty mess_garageProperty() {
        return mess_Garage;
    }
    
    public final StringProperty mess_userProperty() {
        return mess_User;
    }

    //Setters

    public void setMotif(StringProperty requestMotif) {
        requestMotif.set(getMotif());
    }

    public void setComment(StringProperty requestComment) {
        requestComment.set(getComment());
    }

    public void setUserName(String userName) {
        this.userName.set(userName);;
    }

    public void setMaile(String mail) {
        this.mail.set(mail);;
    }

    public void setAdresse(String adresse) {
        this.adresse.set(adresse);;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber.set(telephoneNumber);;
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

    public void setMess_Garage(String mess_Garage) {
        this.mess_Garage.set(getMess_Garage());
    }

    public void setMess_User(String mess_User) {
        this.mess_User.set(mess_User);
    }
}
