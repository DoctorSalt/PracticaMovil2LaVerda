package es.studium.practicamovil2laverda.boton4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.studium.practicamovil2laverda.R;

public class SeleccionImagen extends AppCompatActivity {

    private FragmentTransaction transactionImg;

    private Button botonFerrari, botonMclaren, botonMazda, botonRuf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getText(R.string.principal_seleccionImagenes));

        setContentView(R.layout.activity_seleccion_imagen);
        botonFerrari = (Button) findViewById(R.id.btnFerrari);
        botonMclaren = (Button) findViewById(R.id.btnMclaren);
        botonMazda = (Button) findViewById(R.id.btnMazda);
        botonRuf = (Button) findViewById(R.id.btnRUF);
        botonFerrari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizarFerrari();
            }
        });
        botonMclaren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizarMclaren();
            }
        });
        botonMazda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizarMadza();
            }
        });
        botonRuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizarRUF();
            }
        });
    }
    private void visualizarFerrari() {
            transactionImg = getSupportFragmentManager().beginTransaction();
            transactionImg.add(R.id.fragmentCoche, new FragmentFerrariImg());
            transactionImg.commit();
    }
    private void visualizarMclaren() {
            transactionImg = getSupportFragmentManager().beginTransaction();
            transactionImg.add(R.id.fragmentCoche, new FragmnentMclarenImg());
            transactionImg.commit();
    }
    private void visualizarMadza(){
            transactionImg = getSupportFragmentManager().beginTransaction();
            transactionImg.add(R.id.fragmentCoche, new FragmentMazdaImg());
            transactionImg.commit();
    }
    private void visualizarRUF(){
        transactionImg = getSupportFragmentManager().beginTransaction();
        transactionImg.add(R.id.fragmentCoche, new FragmentRufImg());
        transactionImg.commit();
    }
}
