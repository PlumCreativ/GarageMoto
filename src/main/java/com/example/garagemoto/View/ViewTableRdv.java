package com.example.garagemoto.View;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewTableRdv {



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
    public static int getRequestId() {
        return requestId.get();
    }

    public static String getMotif() {
        return requestMotif.get();
    }

    public static String getComment() {
        return requestComment.get();
    }


    //Property's
    public final StringProperty requestMotifProperty() {
        return requestMotif;
     }

    public final StringProperty requestCommentProperty() {
        return requestComment;
     }

    public final IntegerProperty requestidProperty() {
        return requestId;
     }


    //Setters
    public void setRequestId(SimpleIntegerProperty requestId) {
        requestId.set(getRequestId());
    }

    public void setMotif(SimpleStringProperty requestMotif) {
        requestMotif.set(getMotif());
    }

    public void setComment(SimpleStringProperty requestComment) {
        requestComment.set(getComment());
    }


    // @Override
    // public String toString() {
    //     return "User " + requestUser + " - " + requestMotif + " - " + requestComment + " - " + requestPieces + " - " + requestMessage ;
    // }

}
