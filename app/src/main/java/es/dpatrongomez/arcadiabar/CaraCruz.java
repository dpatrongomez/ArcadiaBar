package es.dpatrongomez.arcadiabar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CaraCruz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
