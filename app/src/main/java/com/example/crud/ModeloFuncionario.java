package com.example.crud;

import java.io.Serializable;

public class ModeloFuncionario implements Serializable {

    private String produto;

    public String getProduto(){
        return produto;
    }

    public void setFProduto(String Fproduto) {
        produto = Fproduto;
    }
}
