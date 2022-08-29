package br.edu.ifsp.arq.ads.dmos5.appaula4_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ESTADO = 1;
    private static final String STATE_ESTADO = "estado";

    private Button btnSelecionar;
    private String estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelecionar = findViewById(R.id.btn_selecionar);
        btnSelecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this,
                        TelaDeSelecaoActivity.class);
                intent.putExtra(TelaDeSelecaoActivity.EXTRA_ESTADO, estado);
                startActivityForResult(intent, REQUEST_ESTADO);
            }
        });
        if(savedInstanceState != null){
            estado = savedInstanceState.getString(STATE_ESTADO);
            btnSelecionar.setText(estado);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == REQUEST_ESTADO){
            estado = data.getStringExtra(TelaDeSelecaoActivity.EXTRA_RESULTADO);
            if(estado != null){
                btnSelecionar.setText(estado);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_ESTADO, estado);
    }
}