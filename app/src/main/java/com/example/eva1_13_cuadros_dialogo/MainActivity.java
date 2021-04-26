package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Eventos Click
    public void onClicCDSistema(View view){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de android")
                .setMessage("Hola mundo!")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "botton OK", Toast.LENGTH_SHORT).show();
                                                       //GETAPPICATIONCONTEXt
                            }
                        })
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "botton No", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
    }

    public void onClickCDCustom(View view){
        Dialog dlgMiCuadroDialogo = new Dialog(this);
        //Asignar Layout
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //Vincular los widgets
        TextView txtVwTitulo;
        final EditText edtTextDatos;
        Button btnAccion;
        txtVwTitulo = dlgMiCuadroDialogo.findViewById(R.id.txtTitulo);
        edtTextDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtVwTitulo.setText("Este es un cuadro de dialogo perzonalizado");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, edtTextDatos.getText().toString(),
                        Toast.LENGTH_SHORT).show();
                    }
                }
        );
        dlgMiCuadroDialogo.show();
    }
}