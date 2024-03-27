package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableUser {

    private IntegerProperty request_userId;
    private StringProperty userName;
    private StringProperty mail;
    private StringProperty adresse;
    private IntegerProperty telephoneNumber;
    
    //Constructor
    public ViewTableUser(int _request_userId, String _userName, String _mail, String _adresse, int _telephoneNumber){
        this.userName = new SimpleStringProperty(_userName);
        this.mail = new SimpleStringProperty(_mail);
        this.adresse = new SimpleStringProperty(_adresse);
        this.telephoneNumber = new SimpleIntegerProperty(_telephoneNumber);

        if (_request_userId != 0) {
            this.request_userId = new SimpleIntegerProperty(_request_userId) ;
        }
    }
    
    //Getters
    public Integer getRequest_userId() {
        return request_userId.get();
    }

    public String getUserName() {
        return userName.get();
    }

    public String getMaile() {
        return mail.get();
    }

    public String getAdresse() {
        return adresse.get();
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber.get();
    }

    //Property's
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
