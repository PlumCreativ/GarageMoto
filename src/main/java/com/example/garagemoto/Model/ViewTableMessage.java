package com.example.garagemoto.Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViewTableMessage {

    private SimpleIntegerProperty request_messageId;
    private SimpleStringProperty mess_Garage;
    private SimpleStringProperty mess_User;

    
    //Getters
    public SimpleIntegerProperty getRequest_messageId() {
        return request_messageId;
    }

    public SimpleStringProperty getMess_Garage() {
        return mess_Garage;
    }

    public SimpleStringProperty getMess_User() {
        return mess_User;
    }


    //Setters
    public void setRequest_messageId(SimpleIntegerProperty request_messageId) {
        this.request_messageId = request_messageId;
    }

    public void setMess_Garage(SimpleStringProperty mess_Garage) {
        this.mess_Garage = mess_Garage;
    }

    public void setMess_User(SimpleStringProperty mess_User) {
        this.mess_User = mess_User;
    }

    //Constructor
    public ViewTableMessage(int _request_messageId, String _mess_Garage, String _mess_User){

        
        this.mess_Garage = new SimpleStringProperty(_mess_Garage) ;
        this.mess_User = new SimpleStringProperty(_mess_User) ;

        if (_request_messageId != 0) {
            this.request_messageId = new SimpleIntegerProperty(_request_messageId) ;
        }
    }
}
