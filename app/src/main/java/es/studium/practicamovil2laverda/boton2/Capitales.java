package es.studium.practicamovil2laverda.boton2;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

import es.studium.practicamovil2laverda.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Capitales extends Fragment {



    private String [] arrayCapitales;
    private ListView listaCapitales;
    private ArrayAdapter<String> ListViewAdapter;
    private fragmentCapitalesListener fragmentCapListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_capitales, container, false);
       arrayCapitales =getResources().getStringArray(R.array.Capitales);
        listaCapitales = view.findViewById(R.id.ListaCapitales);
        ListViewAdapter= new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                arrayCapitales
        );
        listaCapitales.setAdapter(ListViewAdapter);
        listaCapitales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String capitalSeleccionada="";
                switch(position){
                    case 0:
                        capitalSeleccionada=arrayCapitales[0];
                        break;
                    case 1:
                        capitalSeleccionada=arrayCapitales[1];
                        break;
                    case 2:
                        capitalSeleccionada=arrayCapitales[2];
                        break;
                    case 3:
                        capitalSeleccionada=arrayCapitales[3];
                        break;
                    case 4:
                        capitalSeleccionada=arrayCapitales[4];
                        break;
                    case 5:
                        capitalSeleccionada=arrayCapitales[5];
                        break;
                    case 6:
                        capitalSeleccionada=arrayCapitales[6];
                        break;
                    case 7:
                        capitalSeleccionada=arrayCapitales[7];
                        break;
                }
                fragmentCapListener.onInputCapitalSent(capitalSeleccionada);
            }
        });
        return view;
    }
    public interface fragmentCapitalesListener{
        void onInputCapitalSent(String x);
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof fragmentCapitalesListener){
            fragmentCapListener = (fragmentCapitalesListener) context;
        } else {
            throw new RuntimeException(context.toString()+" hay que implementar fragmentCapitalesListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentCapListener = null;
    }
}
