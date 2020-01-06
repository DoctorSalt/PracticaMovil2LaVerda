package es.studium.practicamovil2laverda.boton2;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import es.studium.practicamovil2laverda.R;


public class FragmentPaises extends Fragment {


    public FragmentPaises() {
        // Required empty public constructor
    }
    private String [] arrayPaises;
    private ListView listaPaises;
    ArrayAdapter<String>ListViewAdapter;
    private fragmentPaisesListener fragmentPaisListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       arrayPaises =getResources().getStringArray(R.array.Paises);
        View view = inflater.inflate(R.layout.fragment_paises, container, false);
        listaPaises = view.findViewById(R.id.ListaPaises);
        ListViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                arrayPaises
        );
        listaPaises.setAdapter(ListViewAdapter);
        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String paisSeleccionado="";
                switch(position){
                    case 0:
                        paisSeleccionado=arrayPaises[0];
                        break;
                    case 1:
                        paisSeleccionado=arrayPaises[1];
                        break;
                    case 2:
                        paisSeleccionado=arrayPaises[2];
                        break;
                    case 3:
                        paisSeleccionado=arrayPaises[3];
                        break;
                    case 4:
                        paisSeleccionado=arrayPaises[4];
                        break;
                    case 5:
                        paisSeleccionado=arrayPaises[5];
                        break;
                    case 6:
                        paisSeleccionado=arrayPaises[6];
                        break;
                    case 7:
                        paisSeleccionado=arrayPaises[7];
                        break;
                    case 8:
                        paisSeleccionado=arrayPaises[8];
                        break;
                    case 9:
                        paisSeleccionado=arrayPaises[9];
                        break;
                }
                fragmentPaisListener.onInputPaisSent(paisSeleccionado);
            }
        });

        return view;
    }
    public interface fragmentPaisesListener{
        void onInputPaisSent(String x);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof fragmentPaisesListener){
            fragmentPaisListener = (fragmentPaisesListener) context;
        }else{
            throw new RuntimeException(context.toString()+" hay que implementar fragmentPaisListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentPaisListener = null;
    }
}
