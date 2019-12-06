package com.example.crud;



import java.io.Serializable;

public class ModeloCliente implements Serializable {

    private String cliente;

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String Ccliente){
        cliente = Ccliente;
    }

}
