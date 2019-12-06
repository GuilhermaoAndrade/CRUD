package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clientebutton(View view) {
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

    public void funcionariobutton(View view) {
        Intent intent = new Intent(this, ProdutoActivity.class);
        startActivity(intent);
    }

    public void reuniaobutton(View view) {
        Intent intent = new Intent(this, ReuniaoActivity.class);
        startActivity(intent);
    }

    public void agendabutton(View view) {
        Intent intent = new Intent(this, AgendaActivity.class);
        startActivity(intent);
    }
}
