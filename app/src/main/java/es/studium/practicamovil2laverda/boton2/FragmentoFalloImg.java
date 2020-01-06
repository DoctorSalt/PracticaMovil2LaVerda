package es.studium.practicamovil2laverda.boton2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.studium.practicamovil2laverda.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoFalloImg extends Fragment {


    public FragmentoFalloImg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_fallo_img, container, false);
    }

}
