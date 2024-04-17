package com.example.garagemoto.View;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableGarage {
    
    private static IntegerProperty request_garageId;
    private static StringProperty garageName;
    private static StringProperty adresseGarage;
    private static StringProperty mailGarage;

    public ViewTableGarage(
        int _request_garageId, 
        String _garageName, 
        String _adresse, 
        String _mail
        ){
        garageName = new SimpleStringProperty(_garageName);
        adresseGarage = new SimpleStringProperty(_adresse);
        mailGarage = new SimpleStringProperty(_mail);

        if (_request_garageId != 0) {
            request_garageId = new SimpleIntegerProperty(_request_garageId) ;
        }
    }

    //Getters
    public static Integer getRequest_garageId() {
        return request_garageId.get();
    }

    public static String getGarageName() {
        return garageName.get();
    }

    public static String getAdresse() {
        return adresseGarage.get();
    }

    public static String getMaile() {
        return mailGarage.get();
    }

    //Property's
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


    //Setters
    public void setRequest_garageId(Integer request_garageId) {
        this.request_garageId.set(getRequest_garageId());;
    }

    public void setGarageName(String garageName) {
        this.garageName.set(getGarageName());
    }

    public void setAdresse(String adresseGarage) {
        this.adresseGarage.set(getAdresse());
    }

    public void setMaile(String mailGarage) {
        this.mailGarage.set(getMaile());
    }
    
}
