package es.studium.practicamovil2laverda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class SeleccionImagen extends AppCompatActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_imagen);
        viewPager = findViewById(R.id.viewPageDesp);
        viewPager.setAdapter(new ViewPagerDespladorDeImagenes(getSupportFragmentManager(
        )));
    }

}
