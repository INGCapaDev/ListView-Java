package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
        listPaises.setOnItemClickListener((parent, view, position, id) -> {
            String strModal = "Selecciono el pais " + parent.getItemAtPosition(position).toString();
            Toast.makeText(MainActivity.this, strModal, Toast.LENGTH_SHORT ).show();
        });
    }

    private void iniciarComponentes(){
        listPaises = findViewById(R.id.listPaises);
        ArrayAdapter<String> Adaptador =
                new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.arrayPaises));
        listPaises.setAdapter(Adaptador);
    }
}