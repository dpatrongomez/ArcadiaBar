package es.dpatrongomez.arcadiabar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class CaraCruz extends AppCompatActivity {

    Random r;
    int monedalado; // 0 = Cara 1 = Cruz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button girar = findViewById(R.id.girar);

        final ImageView moneda = findViewById(R.id.moneda);

        r = new Random();

        girar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monedalado = r.nextInt(2);

                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.0f);
                rotate.setDuration(100);
                moneda.startAnimation(rotate);

                if (monedalado == 0) {
                    moneda.setImageResource(R.drawable.cara);
                    Toast toast = Toast.makeText(CaraCruz.this, "CARA", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 400);
                    toast.show();
                } else {
                    moneda.setImageResource(R.drawable.cruz);
                    Toast toast = Toast.makeText(CaraCruz.this, "CRUZ", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 400);
                    toast.show();
                }



            }
        });
    }
}
