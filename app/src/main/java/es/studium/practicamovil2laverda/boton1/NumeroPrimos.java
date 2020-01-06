package es.studium.practicamovil2laverda.boton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import es.studium.practicamovil2laverda.R;

public class NumeroPrimos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getText(R.string.principal_iniciarPrimos));
        setContentView(R.layout.activity_numero_primos);
        Button btnCalcular = (Button)findViewById(R.id.btnCalculo);
        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
               TextView textoResultado = findViewById(R.id.txtResult);
               final EditText textoEdad = findViewById(R.id.inNumber);
               int numero = Integer.parseInt(textoEdad.getText().toString());
               Boolean resultado = esPrimo(numero);
               if(resultado.equals(true)){
                  textoResultado.setText("Es primo");
               }else{
                  textoResultado.setText("No es primo");
                  }
               }
            });
        }
        public Boolean esPrimo(int n){
        //En caso que sea
            if(n==2){
                return true;
            }
            //revisa si n es multiplo de 2
            if (n%2==0)
            {
                return false;
            }
            //si no, solo revisa los impares
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }
}
