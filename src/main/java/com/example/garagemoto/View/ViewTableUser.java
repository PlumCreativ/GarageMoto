package com.example.garagemoto.View;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViewTableUser {

    private SimpleIntegerProperty request_userId;
    private SimpleStringProperty userName;
    private SimpleStringProperty mail;
    private SimpleStringProperty adresse;
    private SimpleIntegerProperty telephoneNumber;
    
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
    public SimpleIntegerProperty getRequest_userId() {
        return request_userId;
    }

    public SimpleStringProperty getUserName() {
        return userName;
    }

    public SimpleStringProperty getMaile() {
        return mail;
    }

    public SimpleStringProperty getAdresse() {
        return adresse;
    }

    public SimpleIntegerProperty getTelephoneNumber() {
        return telephoneNumber;
    }

    //Setters
    public void setRequest_userId(SimpleIntegerProperty request_userId) {
        this.request_userId = request_userId;
    }

    public void setUserName(SimpleStringProperty userName) {
        this.userName = userName;
    }

    public void setMaile(SimpleStringProperty mail) {
        this.mail = mail;
    }

    public void setAdresse(SimpleStringProperty adresse) {
        this.adresse = adresse;
    }

    public void setTelephoneNumber(SimpleIntegerProperty telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
}
