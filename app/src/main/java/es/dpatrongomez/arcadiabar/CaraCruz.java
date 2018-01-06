package es.dpatrongomez.arcadiabar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class CaraCruz extends AppCompatActivity {

    Button girar;

    ImageView moneda;

    Random r;

    int monedalado; // 0 = Cara 1 = Cruz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        girar = (Button) findViewById(R.id.girar);

        moneda = (ImageView) findViewById(R.id.moneda);

        r = new Random();

        girar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monedalado = r.nextInt(2);

                if (monedalado == 0){
                    moneda.setImageResource(R.drawable.cara);
                } else if (monedalado== 1){
                    moneda.setImageResource(R.drawable.cruz);
                }

                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(100);
                moneda.startAnimation(rotate);

            }
        });
    }
}
