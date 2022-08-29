package br.edu.ifsp.arq.ads.dmos5.appaula4_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private ListView listNomes;
    private ArrayList<String> nomes;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            nomes = savedInstanceState.getStringArrayList("nomes");
        }else{
            nomes = new ArrayList<>();
        }
        edtNome = findViewById(R.id.edt_nome);
        listNomes = findViewById(R.id.list_nomes);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);
        listNomes.setAdapter(adapter);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("nomes", nomes);
    }

    public void btnAdicionarClick(View view) {
        nomes.add(edtNome.getText().toString());
        edtNome.setText(null);
        adapter.notifyDataSetChanged();
    }
}