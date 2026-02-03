package com.onaar.recysleview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Produkt> produkty;
    private RecyclerView recyclerView;
    private ZakupyAdapter zakupyAdapter;

    private Button buttonDodaj;

    private EditText editTextCena;
    private EditText editTextNazwa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        produkty = new ArrayList<>();
        produkty.add(new Produkt(1, "chleb"));
        produkty.add(new Produkt(2, "mleko"));
        produkty.add(new Produkt(3, "maslo"));
        produkty.add(new Produkt(4, "ser"));
        produkty.add(new Produkt(5, "jajka"));
        produkty.add(new Produkt(6, "cukier"));
        produkty.add(new Produkt(7, "sol"));
        produkty.add(new Produkt(8, "makaron"));
        produkty.add(new Produkt(9, "ryz"));
        produkty.add(new Produkt(10, "jogurt"));
        recyclerView = findViewById(R.id.recyclerView);
        zakupyAdapter = new ZakupyAdapter(MainActivity.this, produkty);
        recyclerView.setAdapter(zakupyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        buttonDodaj = findViewById(R.id.button2);
        editTextCena = findViewById(R.id.editTextNumberDecimal);
        editTextNazwa = findViewById(R.id.editTextText);
        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String nazwaProduktu = editTextNazwa.getText().toString();
                    }

                });
    }
        }

