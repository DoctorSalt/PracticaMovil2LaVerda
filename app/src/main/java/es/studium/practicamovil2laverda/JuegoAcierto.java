package es.studium.practicamovil2laverda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JuegoAcierto extends AppCompatActivity implements Capitales.fragmentCapitalesListener, Paises.fragmentPaisesListener {
    private Capitales fragmentCapitales;
    private Paises fragmentPaises;
    private TextView paisResult;
    private TextView capitalResult;
    private Button botonVerificar;
    private FragmentTransaction transactionImg;
    private Fragment fragmImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_acierto);
        fragmentCapitales= new Capitales();
        fragmentPaises= new Paises();
        getSupportFragmentManager().beginTransaction().commit();
        paisResult = findViewById(R.id.txtSelectedPais);
        capitalResult = findViewById(R.id.txtSelectedCapital);
        botonVerificar = findViewById(R.id.btnVerificar);
        botonVerificar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String [] arrayPaises = getResources().getStringArray(R.array.Paises);
                        String [] arrayCapitales = getResources().getStringArray(R.array.Capitales);
                        String pais = paisResult.getText().toString();
                        String capital = capitalResult.getText().toString();
                        String resultS = pais+"-"+capital;
                        //Hacer visible fall0
                        if ((arrayPaises[0] + "-" + arrayCapitales[0]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[1] + "-" + arrayCapitales[1]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[2] + "-" + arrayCapitales[2]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[3] + "-" + arrayCapitales[3]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[4] + "-" + arrayCapitales[4]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[5] + "-" + arrayCapitales[5]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[4] + "-" + arrayCapitales[6]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        } else if ((arrayPaises[4] + "-" + arrayCapitales[7]).equals(resultS)) {
                            //ejecutar ok
                            ejecutarOk();
                        }else{
                            //ejecutar fallo
                            ejecutarFallo();
                        }
                    }
                }
        );
    }

    private void ejecutarFallo() {
        fragmImg = new FragmentoFalloImg();
        transactionImg= getSupportFragmentManager().beginTransaction();
        transactionImg.add(R.id.frameComprobar, fragmImg);
        transactionImg.commit();
    }

    private void ejecutarOk() {
        fragmImg = new FragmentCorrectoImg();
        transactionImg = getSupportFragmentManager().beginTransaction();
        transactionImg.add(R.id.frameComprobar, fragmImg);
        transactionImg.commit();
    }

    @Override
    public void onInputCapitalSent(String x) {
      capitalResult.setText(x);
    }

    @Override
    public void onInputPaisSent(String x) {
        paisResult.setText(x);
    }
}
