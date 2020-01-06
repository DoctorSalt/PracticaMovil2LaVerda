package es.studium.practicamovil2laverda.boton3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import es.studium.practicamovil2laverda.R;

public class DesplazarImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getText(R.string.principal_desplazoImagenes));
        setContentView(R.layout.activity_desplazar_imagen);
    }
}
