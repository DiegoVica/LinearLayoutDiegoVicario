package com.example.formulariodiegovicario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nom = findViewById(R.id.etNombre);
        final RadioButton btnHombre = findViewById(R.id.rbtnHombre);
        final RadioButton btnMujer = findViewById(R.id.rbtnMujer);
        final Spinner spProvincias = findViewById(R.id.spinnerProvincias);
        final CheckBox chkAcep = findViewById(R.id.chkAceptar);
        spProvincias.setSelected(false);
        findViewById(R.id.btnBorrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom.setText("");
                btnHombre.setChecked(false);
                btnMujer.setChecked(false);
                spProvincias.setSelection(0);
                chkAcep.setChecked(false);
            }
        });
    }
}
