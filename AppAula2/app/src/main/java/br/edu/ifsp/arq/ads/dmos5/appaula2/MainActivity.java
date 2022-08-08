package br.edu.ifsp.arq.ads.dmos5.appaula2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edt_nome);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtNome.getText().toString();

                Toast.makeText(MainActivity.this, "Seja bem-vindo(a), "
                + nome, Toast.LENGTH_SHORT).show();
            }
        });
    }
}