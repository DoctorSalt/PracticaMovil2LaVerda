package es.studium.practicamovil2laverda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intentPrimos;
    Intent intentJuegoAciertos;
    Intent intentDesplazarImagen;
    Intent intentSeleccionImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentPrimos = new Intent(this,NumeroPrimos.class);
        intentJuegoAciertos = new Intent(this,JuegoAcierto.class);
        intentDesplazarImagen = new Intent(this,DesplazarImagen.class);
        intentSeleccionImagen = new Intent(this,SeleccionImagen.class);
    }
    public void iniciarPrimos(View view) {
        startActivity(intentPrimos);
    }

    public void iniciarJuegos(View view) {
        startActivity(intentJuegoAciertos);
    }

    public void iniciarSeleccionImagen(View view) {
        startActivity(intentSeleccionImagen);
    }

    public void iniciarDesplazoImagen(View view) {
        startActivity(intentDesplazarImagen);
    }

}
