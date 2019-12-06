package com.example.crud;

import java.io.Serializable;

public class ModeloReuniao implements Serializable {
    private String reuniao;

    public String getReuniao(){
        return reuniao;
    }

    public void setReuniao(String Rreuniao) {
        reuniao = Rreuniao;
    }
}
