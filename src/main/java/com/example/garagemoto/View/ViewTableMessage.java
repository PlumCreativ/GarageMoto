package com.example.garagemoto.View;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableMessage {

    private static IntegerProperty request_messageId;
    private static StringProperty mess_Garage;
    private static StringProperty mess_User;

    
    //Getters
    public static Integer getRequest_messageId() {
        return request_messageId.get();
    }

    public static String getMess_Garage() {
        return mess_Garage.get();
    }
    
    public static String getMess_User() {
        return mess_User.get();
    }

    //Property's
    public final IntegerProperty request_messageidProperty() {
        return request_messageId;
     }

    public final StringProperty mess_garageProperty() {
        return mess_Garage;
     }
    
    public final StringProperty mess_userProperty() {
        return mess_User;
    }

    //Setters
    public void setRequest_messageId(int request_messageId) {
        this.request_messageId.set(request_messageId);
    }

    public void setMess_Garage(String mess_Garage) {
        this.mess_Garage.set(getMess_Garage());
    }

    public void setMess_User(String mess_User) {
        this.mess_User.set(mess_User);
    }

    //Constructor
    public ViewTableMessage(
        int _request_messageId, 
        String _mess_Garage, 
        String _mess_User
        ){

        
        mess_Garage = new SimpleStringProperty(_mess_Garage) ;
        mess_User = new SimpleStringProperty(_mess_User) ;

        if (_request_messageId != 0) {
            this.request_messageId = new SimpleIntegerProperty(_request_messageId) ;
        }
    }

}
