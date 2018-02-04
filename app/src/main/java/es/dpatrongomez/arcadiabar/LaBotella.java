package es.dpatrongomez.arcadiabar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LaBotella extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
