package com.example.crud;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.renderscript.Type;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLException;

public class ClienteActivity extends AppCompatActivity {

    EditText firstname;
    TextView textView;
    DB_Controller controller;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        controller = new DB_Controller(this);

        firstname = (EditText) findViewById(R.id.firstname_input);
        textView = (TextView) findViewById(R.id.textview);

    }

    public void add(View view) {
        ModeloCliente MC = new ModeloCliente();
        MC.setCliente(firstname.getText().toString());
        controller.insert_cliente(MC);
    }

    public void list(View view) {
        controller.list_all_cliente(textView) ;
    }

    public void delete(View view) {
        controller.delete_cliente(firstname.getText().toString());
    }

    public void update(View view) {
       AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Novo nome");
        final EditText new_firstname = new EditText(ClienteActivity.this);
        alertDialogBuilder.setView(new_firstname);

        alertDialogBuilder.setPositiveButton("Editar",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        controller.update_cliente(firstname.getText().toString(),new_firstname.getText().toString());
                    }
                });


        alertDialogBuilder.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}




