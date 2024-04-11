package com.example.garagemoto.View;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableManager {

    //Properties

    //Garage Property's
    public final IntegerProperty request_garageidProperty() {
        return request_garageId;
        }

    public final StringProperty garagenameProperty() {
        return garageName;
        }
    
    public final StringProperty adressegarageProperty() {
        return adresseGarage;
    }

    public final StringProperty mailgarageProperty() {
        return mailGarage;
    }

    //Message Property's
    public final IntegerProperty request_messageidProperty() {
        return request_messageId;
        }

    public final StringProperty mess_garageProperty() {
        return mess_Garage;
        }
    
    public final StringProperty mess_userProperty() {
        return mess_User;
    }

    //Pieces Property's
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

    //User Property's
    public final IntegerProperty request_useridProperty() {
        return request_userId;
        }

    public final StringProperty usernameProperty() {
        return userName;
        }
    
    public final StringProperty mailProperty() {
        return mail;
    }
    
    public final StringProperty adresseProperty() {
        return adresse;
    }

    public final IntegerProperty telephonenumberProperty() {
        return telephoneNumber;
    }
    //Rdv Property's
    public final StringProperty requestmotifProperty() {
        return requestMotif;
    }

    public final StringProperty requestcommentProperty() {
        return requestComment;
    }
    
    public final IntegerProperty requestidProperty() {
        return requestId;
    }

    //

    public IntegerProperty getRequest_garageId() {
        return request_garageId;
    }

    public void setRequest_garageId(IntegerProperty request_garageId) {
        this.request_garageId = request_garageId;
    }

    public StringProperty getGarageName() {
        return garageName;
    }

    public void setGarageName(StringProperty garageName) {
        this.garageName = garageName;
    }

    public StringProperty getAdresseGarage() {
        return adresseGarage;
    }

    public void setAdresseGarage(StringProperty adresseGarage) {
        this.adresseGarage = adresseGarage;
    }

    public StringProperty getMailGarage() {
        return mailGarage;
    }

    public void setMailGarage(StringProperty mailGarage) {
        this.mailGarage = mailGarage;
    }
    

    public static Integer getRequestId() {
        return requestId.get();
    }



    public static void setRequestId(SimpleIntegerProperty requestId) {
        ViewTableManager.requestId = requestId;
    }



    public static  String getRequestMotif() {
        return requestMotif.get();
    }



    public static void setRequestMotif(SimpleStringProperty requestMotif) {
        ViewTableManager.requestMotif = requestMotif;
    }



    public static  String getRequestComment() {
        return requestComment.get();
    }



    public void setRequestComment(SimpleStringProperty requestComment) {
        ViewTableManager.requestComment = requestComment;
    }



    public IntegerProperty getRequest_piecesId() {
        return request_piecesId;
    }



    public void setRequest_piecesId(IntegerProperty request_piecesId) {
        this.request_piecesId = request_piecesId;
    }



    public StringProperty getPieceName() {
        return pieceName;
    }



    public void setPieceName(StringProperty pieceName) {
        this.pieceName = pieceName;
    }



    public IntegerProperty getPieceType() {
        return pieceType;
    }



    public void setPieceType(IntegerProperty pieceType) {
        this.pieceType = pieceType;
    }



    public IntegerProperty getPiecePrix() {
        return piecePrix;
    }



    public void setPiecePrix(IntegerProperty piecePrix) {
        this.piecePrix = piecePrix;
    }



    public IntegerProperty getRequest_userId() {
        return request_userId;
    }



    public void setRequest_userId(IntegerProperty request_userId) {
        this.request_userId = request_userId;
    }



    public StringProperty getUserName() {
        return userName;
    }



    public void setUserName(StringProperty userName) {
        this.userName = userName;
    }



    public StringProperty getMail() {
        return mail;
    }



    public void setMail(StringProperty mail) {
        this.mail = mail;
    }



    public StringProperty getAdresse() {
        return adresse;
    }



    public void setAdresse(StringProperty adresse) {
        this.adresse = adresse;
    }



    public IntegerProperty getTelephoneNumber() {
        return telephoneNumber;
    }



    public void setTelephoneNumber(IntegerProperty telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }



    public IntegerProperty getRequest_messageId() {
        return request_messageId;
    }



    public void setRequest_messageId(IntegerProperty request_messageId) {
        this.request_messageId = request_messageId;
    }



    public StringProperty getMess_Garage() {
        return mess_Garage;
    }



    public void setMess_Garage(StringProperty mess_Garage) {
        this.mess_Garage = mess_Garage;
    }



    public StringProperty getMess_User() {
        return mess_User;
    }



    public void setMess_User(StringProperty mess_User) {
        this.mess_User = mess_User;
    }

    


    //Rdv initialisation
    private static  SimpleIntegerProperty requestId; 
    private static  SimpleStringProperty requestMotif;
    private static  SimpleStringProperty requestComment;

    //Pieces initialisation 
    private IntegerProperty request_piecesId;
    private StringProperty pieceName;
    private IntegerProperty pieceType;
    private IntegerProperty piecePrix;

    //User initialisation
    private IntegerProperty request_userId;
    private StringProperty userName;
    private StringProperty mail;
    private StringProperty adresse;
    private IntegerProperty telephoneNumber;

    //Message
    private IntegerProperty request_messageId;
    private StringProperty mess_Garage;
    private StringProperty mess_User;

    //Garage
    private IntegerProperty request_garageId;
    private StringProperty garageName;
    private StringProperty adresseGarage;
    private StringProperty mailGarage;



    public ViewTableManager(
        //Garage Params
        int _request_garageId, 
        String _garageName, 
        String _adresse, 
        String _mail
    ){

        //Garage
        this.garageName = new SimpleStringProperty(_garageName);
        this.adresseGarage = new SimpleStringProperty(_adresse);
        this.mailGarage = new SimpleStringProperty(_mail);

        if (_request_garageId != 0) {
            this.request_garageId = new SimpleIntegerProperty(_request_garageId) ;
        }
    }
    

    public ViewTableManager(
        //Rdv Params
        int _requestId,
        String _requestMotif,
        String _requestComment

    ){

        //Rdv
        requestMotif = new SimpleStringProperty(_requestMotif);
        requestComment = new SimpleStringProperty(_requestComment);

        if (_requestId != 0) {
            requestId = new SimpleIntegerProperty(_requestId) ;
        }
    }

    public ViewTableManager(

        //User Params
        int _request_userId, 
        String _userName, 
        String _mail, 
        String _adresse, 
        int _telephoneNumber

    ){

        //User
        this.userName = new SimpleStringProperty(_userName);
        this.mail = new SimpleStringProperty(_mail);
        this.adresse = new SimpleStringProperty(_adresse);
        this.telephoneNumber = new SimpleIntegerProperty(_telephoneNumber);

        if ( _request_userId != 0) {
            this.request_userId = new SimpleIntegerProperty(_request_userId) ;
        }
    }

    // public ViewTableManager(
    //     //Message
    //     int _request_messageId, 
    //     String _mess_Garage, 
    //     String _mess_User
    // ){

    //     //Message
    //     mess_Garage = new SimpleStringProperty(_mess_Garage) ;
    //     this.mess_User = new SimpleStringProperty(_mess_User) ;


    //     if (_request_messageId != 0) {
    //         this.request_messageId = new SimpleIntegerProperty(_request_messageId) ;
    //     }
    // }

    public ViewTableManager(

        //Pieces Params
        int _request_piecesId, 
        String _pieceName, 
        int _pieceType, 
        int _piecePrix

    ){

        //Pieces
        this.pieceName = new SimpleStringProperty(_pieceName);
        this.pieceType = new SimpleIntegerProperty(_pieceType);
        this.piecePrix = new SimpleIntegerProperty(_piecePrix);


        if (_request_piecesId !=0) {
            this.request_piecesId = new SimpleIntegerProperty(_request_piecesId) ;
        }
    }
    

}
