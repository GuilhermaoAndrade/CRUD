package com.example.crud;

public class ModeloUsuario {
    private static final String SENHA = "1234";
    private static final String LOGIN = "Guilherme";
    private String senha;
    private String login;

    public String getSenha(){
        return senha;
    }
    public String getLogin(){
        return login;
    }

    public void setSenha(String Ssenha)
    {
        senha = Ssenha;
    }

    public void setLogin(String SLogin)
    {
        login = SLogin;
    }

    public boolean ValidarLogin() {
       if(senha.equals(SENHA) && login.equals(LOGIN)){
            return true;
        }else{
           return false;
       }
    }
}



