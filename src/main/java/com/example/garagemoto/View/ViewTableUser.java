package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableUser{

    private  IntegerProperty request_userId;
    private  StringProperty userName;
    private  StringProperty mail;
    private  StringProperty adresse;
    private  IntegerProperty telephoneNumber;
    
    //Constructor
    public ViewTableUser(
        int _request_userId, 
        String _userName, 
        String _mail, 
        String _adresse, 
        int _telephoneNumber
        ){
        userName = new SimpleStringProperty(_userName);
        mail = new SimpleStringProperty(_mail);
        adresse = new SimpleStringProperty(_adresse);
        telephoneNumber = new SimpleIntegerProperty(_telephoneNumber);

        if (_request_userId != 0) {
            request_userId = new SimpleIntegerProperty(_request_userId) ;
        }
    }
    
    //Getters
    public int getRequest_userId() {
        return request_userId.get();
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

    //Property's
    public  IntegerProperty request_useridProperty() {
        return request_userId;
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

    //Setters
    public void setRequest_userId(int request_userId) {
        this.request_userId.set(request_userId);
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

}
