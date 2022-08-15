package br.edu.ifsp.arq.ads.dmos5.appaula3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnEnviar(View view) {
        Intent intent = new Intent(this, Tela2Activity.class);

        // enviar dados (String e int)
        intent.putExtra("nome", "Ana Maria");
        intent.putExtra("idade", 25);

        // enviar um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Mariana", 30 );
        intent.putExtra("pessoa", pessoa);

        startActivity(intent);
    }
}