package com.example.garagemoto.View;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViewTableGarage {
    
    private SimpleIntegerProperty request_garageId;
    private SimpleStringProperty garageName;
    private SimpleStringProperty adresse;
    private SimpleStringProperty mail;

    public ViewTableGarage(int _request_garageId, String _garageName, String _adresse, String _mail){
        this.garageName = new SimpleStringProperty(_garageName);
        this.adresse = new SimpleStringProperty(_adresse);
        this.mail = new SimpleStringProperty(_mail);

        if (_request_garageId != 0) {
            this.request_garageId = new SimpleIntegerProperty(_request_garageId) ;
        }
    }

    //Getters
    public SimpleIntegerProperty getRequest_garageId() {
        return request_garageId;
    }

    public SimpleStringProperty getGarageName() {
        return garageName;
    }

    public SimpleStringProperty getAdresse() {
        return adresse;
    }

    public SimpleStringProperty getMaile() {
        return mail;
    }


    //Setters
    public void setRequest_garageId(SimpleIntegerProperty request_garageId) {
        this.request_garageId = request_garageId;
    }

    public void setGarageName(SimpleStringProperty garageName) {
        this.garageName = garageName;
    }

    public void setAdresse(SimpleStringProperty adresse) {
        this.adresse = adresse;
    }

    public void setMaile(SimpleStringProperty mail) {
        this.mail = mail;
    }
    
}
