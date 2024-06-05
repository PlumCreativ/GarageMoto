package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableRdv implements ViewTableManager{

    //Static Variables
    private static IntegerProperty requestId; 
    private static StringProperty requestMotif;
    private static StringProperty requestComment;

    //Constructor
    public ViewTableRdv(
        int _requestId,
        String _requestMotif,
        String _requestComment

        ) {
        requestMotif = new SimpleStringProperty(_requestMotif);
        requestComment = new SimpleStringProperty(_requestComment);

        if (_requestId != 0) {
            requestId = new SimpleIntegerProperty(_requestId) ;
        }
    }


    //Getters
    public int getRequestId() {
        return requestId.get();
    }

    public String getMotif() {
        return requestMotif.get();
    }

    public String getComment() {
        return requestComment.get();
    }


    //Property's
    public StringProperty requestMotifProperty() {
        return requestMotif;
     }

    public StringProperty requestCommentProperty() {
        return requestComment;
     }

    public IntegerProperty requestidProperty() {
        return requestId;
     }


    //Setters
    public void setRequestId(IntegerProperty requestId) {
        requestId.set(getRequestId());
    }

    public void setMotif(StringProperty requestMotif) {
        requestMotif.set(getMotif());
    }

    public void setComment(StringProperty requestComment) {
        requestComment.set(getComment());
    }


    //Implement class's
    @Override
    public int getRequest_userId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRequest_userId'");
    }


    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserName'");
    }


    @Override
    public String getMaile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaile'");
    }


    @Override
    public String getAdresse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdresse'");
    }


    @Override
    public int getTelephoneNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelephoneNumber'");
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}
