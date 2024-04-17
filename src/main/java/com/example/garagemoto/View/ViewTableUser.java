package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableUser {

    private static IntegerProperty request_userId;
    private static StringProperty userName;
    private static StringProperty mail;
    private static StringProperty adresse;
    private static IntegerProperty telephoneNumber;
    
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
    public static Integer getRequest_userId() {
        return request_userId.get();
    }

    public static String getUserName() {
        return userName.get();
    }

    public static String getMaile() {
        return mail.get();
    }

    public static String getAdresse() {
        return adresse.get();
    }

    public static Integer getTelephoneNumber() {
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
