package br.edu.ifsp.arq.ads.dmos5.appaula3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo", getClassName() + ".onStart() foi chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo", getClassName() + ".onResume() foi chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo", getClassName() + ".onPause() foi chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo", getClassName() + ".onStop() foi chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo", getClassName() + ".onRestart() foi chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo", getClassName() + ".onDestroy() foi chamado.");
    }

    private String getClassName() {
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));
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